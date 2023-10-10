import linkedList.MyLinkedList;
import linkedList.Node;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(6,6);

        list.remove(2);
        list.remove(11);

        System.out.println(list.contains(3));
        System.out.println(list);


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        Node head = myLinkedList.getHead();
        System.out.println(head);

        System.out.println(head.getNext());
        System.out.println(head.getNext().getNext());

        Map<String, Integer> maps = new HashMap<>();
        maps.put("SpiderMan", 1);

    }
}