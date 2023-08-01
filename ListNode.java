
public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class SortedLinkedList {
    private ListNode head;

    public SortedLinkedList() {
        this.head = null;
    }

    public void insertNode(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null && temp.next.data < value) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        list.insertNode(5);
        list.insertNode(1);
        list.insertNode(10);
        list.insertNode(1);

        list.printList();
    }
}


