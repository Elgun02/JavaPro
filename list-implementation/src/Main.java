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
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
        System.out.println(arr.length);

        list.add(4,6);
        System.out.println();

        System.out.println(list);

    }
}