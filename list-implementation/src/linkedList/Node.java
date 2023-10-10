package linkedList;

public class Node {
    private int value;
    private Node last;
    private Node next;

//    public Node(int value, Node last, Node next) {
//        this.value = value;
//        this.last = last;
//        this.next = next;
//    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
