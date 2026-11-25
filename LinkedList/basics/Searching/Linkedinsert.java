package LinkedList.basics.Searching;

public class Linkedinsert {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node head;
    static Node tail;

    // Insert at End
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

    // Insert at Start
    public static void insertStart(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }


    // Display Linked List
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

        insertStart(5);
        insertStart(1);

        display();
    }
}