package LinkedList.basics.Doublylinkedlist;

public class InsertLast {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head;
    static Node tail;

    public static void insertLast(int value) {

        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        insertLast(10);
        insertLast(20);
        insertLast(30);

        display();
    }
}