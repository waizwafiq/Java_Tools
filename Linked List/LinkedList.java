package List;

public class LinkedList {

    private Node head;
    private static int length;

    public LinkedList() { /*Empty constructor*/ }

    public void add(Object data) {
        /*Adding data into the linked list*/

        if (head == null) head = new Node(data); //data is 1st elem for initialization

        Node temp = new Node(data);
        Node current = head;

        if (current != null) { //avoiding NullPointer Exception
            //Starting at head node, traverse to the end, then add data.
            while (current.getNext() != null)
                current = current.getNext();

            //place the new node at the last node
            current.setNext(temp);
        }
        incrementLength();
    }

    public void add(Object data, int idx){
        /*Adding data into the linked list with specified index*/
    }

    private static int getLength() {
        return length;
    }

    private static void incrementLength() {
        length++;
    }

    private static void decrementLength() {
        length--;
    }


    private class Node{
        /*THE NODE CLASS*/

        //This is a reference to the next node in the chain (null if none)
        Node next;

        //Data carried by this particular node (Object means any data type such as String, int, etc.)
        Object data;

        //Node constructor
        public Node(Object data) {
            next = null;
            this.data = data;
        }

        //Another constructor to refer which node to point to (not null)
        public Node(Node next, Object data) {
            this.next = next;
            this.data = data;
        }

        //Accessor methods
        public Node getNext() {
            return next;
        }

        public Object getData() {
            return data;
        }

        //Mutator methods
        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

}
