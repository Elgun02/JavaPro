import java.util.Arrays;

public class MyArrayList {
    private int[] array;
    private int size;
    public MyArrayList() {
        array = new int[10];
    }

    public void set(int index, int element) {
        array[index] = element;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element){
                return true;
            }
        }
        return false;
    }

    public void add(int value) {
        if (size == array.length) {
            grow();
        }
        array[size] = value;
        size++;
    }

    public void add(int index, int value) {
        if (size == array.length) {
            grow();
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index >=0 && index <= size) {
            int[] newArray = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i ++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            System.arraycopy(newArray, 0, array, 0, array.length - 1);
            size--;
        } else if (index > array.length) {
            System.out.println("Error 404");

        }
    }

    public int size() {
        return size;
    }

    private void grow() {
        int[] newArray = new int[(int) (array.length * 1.5)];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}