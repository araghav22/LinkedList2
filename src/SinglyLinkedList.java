import java.util.ArrayList;

public class SinglyLinkedList {



    private Node head = null;
    private int size = 0;

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        result.append("[");

        Node temp = this.head;

        while(temp.next != null)
        {
            result.append(temp.data);
            temp = temp.next;
        }


        result.append("]");

        return result.toString();
    }

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        System.out.println(linkedList);
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
