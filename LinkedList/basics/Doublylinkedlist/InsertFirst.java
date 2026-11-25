package LinkedList.basics.Doublylinkedlist;

public class InsertFirst {

        static class Node {
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

        public static void insertFirst(int value) {
            Node temp = new Node(value);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
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

            insertFirst(30);
            insertFirst(20);
            insertFirst(10);

            display();
        }
    }

