public class SinglyLinkedList {



    private Node head = null;
    private int size = 0;

    public static void main(String[] args) {

    }



    public SinglyLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    private static class Node {

        private int data;
        private Node next;


        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
