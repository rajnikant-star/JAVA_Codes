public class DeleteLAstNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node delete(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before Deletion:");
        printList(head);

        head = delete(head);

        System.out.println("After Deletion:");
        printList(head);
    }
}