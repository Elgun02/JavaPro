package linkedList;

public class MyLinkedList {

    private Node head;

    public void add(int value) {
        if (head == null) {
            Node node = new Node();
            node.setValue(value);
            head = node;
        }
        else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            Node node = new Node();
            node.setValue(value);
            currentNode.setNext(node);
            node.setLast(currentNode);
        }

    }

    public Node getHead() {
        return head;
    }
}
