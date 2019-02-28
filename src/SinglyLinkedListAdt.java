public class SinglyLinkedListAdt {

    private static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {

            this.data = data;
            this.next = next;
        }

    }

    private int size = 0;
    private Node head = null;
    public static void main(String[] args) {

        SinglyLinkedListAdt linkedList = new SinglyLinkedListAdt();
        System.out.println(linkedList);


        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        System.out.println(linkedList);

    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("{");

        Node temp = this.head;
        while (temp != null)
        {
            result.append(temp.data);
            if(temp.next != null)
            {
                result.append(" ==> ");
            }
            temp = temp.next;

        }

        result.append("}");
        return  result.toString();
    }

    private void insertHead(int data){
        Node newNode = new Node(data ,this.head);
        this.head = newNode;
        size++;
    }

    private void insertAfter(int data, Node node){
        Node newNode = new Node(data, node.next);
        node.next = newNode;
        size++;
    }
    private void insert(int data){
        if(head == null){
            insertHead(data);
        }
        else {
            Node temp = this.head;
            while (temp.next != null){
                temp = temp.next;
            }
            insertAfter(data,temp);
        }

    }

    private int removeHead(){
        int response = -1;
        Node temp = this.head;

        if(temp != null){
            this.size--;
            response = temp.data;
            this.head = this.head.next;
        }
        return response;
    }

    private int removeAfter(Node node){
        int response = -1;
        Node temp = node.next;

        if(temp != null){
            response = temp.data;
            node.next = temp.next;
            size--;
        }
        return response;
    }

    public int remove (int data) {
        int response = -1;
        Node temp = this.head;
        if (temp.data == data) {
            response = removeHead();
        } else {
            while (temp.next != null) {
                if (temp.next.data == data) {
                    response = removeAfter(temp);
                    break;
                }
                temp = temp.next;
            }
        }
        return response;
    }
}
