package LinkedList.basics.Searching;

public class DeleteLastNode {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public static void insertEnd(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public static void deleteLast() {

        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    public static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        insertEnd(40);

        System.out.println("Before Delete:");
        display();

        deleteLast();

        System.out.println("After Delete:");
        display();
    }
}