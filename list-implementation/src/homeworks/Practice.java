package homeworks;

import java.util.Arrays;

public class Practice {
    private int[] arr;
    private int size;

    public Practice() {
        arr = new int[10];
    }

    public boolean contains(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return size;
    }

    public void add(int value) {
        if (size == arr.length) {
            grow();
        }
        arr[size] = value;
        size++;
    }

    public void add(int index, int value) {
        if (size == arr.length) {
            grow();
        }
        for (int i = arr.length - 1; index < i; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index >= size) {
            System.out.println("Error");
        } else {
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[i] = arr[i];
                }
                System.out.println(toString());
            }
            arr = newArr;
            size--;
        }
    }

    public int length() {
        return arr.length;
    }

    private void grow() {
        int[] newArr = new int[(int) (arr.length * 1.5)];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr) +
                ", size=" + size;
    }

    public static void main(String[] args) {
        Practice list = new Practice();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);

        list.add(10, 10);
//        list.add(14, 10);
//        list.remove(11);
//        list.remove(11);
//        list.remove(11);
//        list.set(1, 3);

        System.out.println(list.contains(10));
        System.out.println(list.size);
        System.out.println(list.length());




        System.out.println(list);
    }


}
