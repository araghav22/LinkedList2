public class SinglyLinkedList {



    private Node head = null;
    private int size = 0;

    //methode to add new node at head
    public void insert(int value){

       head = new Node(value, this.head);
       size++;

    }


    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(44);
        linkedList.insert(43);
        linkedList.insert(42);
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


    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        result.append("[");

        Node temp = this.head;

        while(temp != null)
        {
            result.append(temp.data);
            if (temp != null){
                result.append(" ==> ");
            }
            temp = temp.next;
        }


        result.append("]");

        return result.toString();
    }


    
}
