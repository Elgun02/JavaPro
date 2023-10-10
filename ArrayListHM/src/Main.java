import java.util.ArrayList;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ArrayLists arr = new ArrayLists();
//        ArrayLists list = new ArrayLists();
//
//        arr.AddRandomNumbers();
//        list.AddNonPositiveNumbers();
//
//        System.out.println();
//        System.out.println("Выведите все элементы списка, которые больше предыдущего элемента этого же списка. ");
//        System.out.println(arr.getArr());
//        arr.InOrderMax();
//        System.out.println();
//        System.out.println();
//        System.out.println("Выведите значение наименьшего из всех положительных элементов в списке.");
//        System.out.println(list.getList());
//        list.InOrderMin();

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(1);
            arrayList.add(1);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(500_000, 1);
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);

        start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(500_000, 1);
        }

        finish = System.currentTimeMillis();

        System.out.println(finish - start);


    }
}