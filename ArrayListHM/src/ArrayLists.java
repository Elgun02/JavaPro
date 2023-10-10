import java.util.ArrayList;
import java.util.Random;

public class ArrayLists {
    private final Random random = new Random();
    private final ArrayList<Integer> arr = new ArrayList<>();
    private final ArrayList<Integer> list = new ArrayList<>();
    public void addRandomNumbers() {
        for (int i = 0; i < 100; i++) {
            arr.add(random.nextInt(100));
        }
    }

    public void inOrderMax() {
        for (int i = 1; i < arr.size(); i++) {
            int currentElement = arr.get(i);
            int previousElement = arr.get(i - 1);

            if (currentElement > previousElement) {
                System.out.print(currentElement + ", ");
            }
        }
    }

    public void addNonPositiveNumbers() {
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(-100,100));
        }
    }

    public void inOrderMin() {
        int minNumber = 101;

        for(int numbers : list){
            if (numbers > 0 && numbers < minNumber) {
                minNumber = numbers;
            }
        }

        System.out.println("Result: " + minNumber);
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

}
