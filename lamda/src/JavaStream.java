import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);
        List<Integer> arr = new ArrayList<>(list);
        System.out.println(arr);

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            value *= 2;
            list.set(i, value);
        }

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 50) {
                list1.add(list.get(i));
            }
        }
        list = list1;

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            value -= 10;
            value /= 4;
            list.set(i, value);
        }

        System.out.println(list);

// -----------------------------------------------------------------------------------
        System.out.println();
        List<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
                int value = arr.get(i);
                value *= 2;
                if (value > 50) {
                    value = (value - 10) / 4;
                    newArr.add(value);
                }
        }

        System.out.println(newArr);

        List<Integer> result = arr.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .sorted()
                .limit(5)
                .toList();

        System.out.println(result);
    }
}
