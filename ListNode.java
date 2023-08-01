
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
        SortedLinkedList linkedList = new SortedLinkedList();

        linkedList.insertNode(5);
        linkedList.insertNode(1);
        linkedList.insertNode(10);
        linkedList.insertNode(1);

        linkedList.printList();
    }
}


