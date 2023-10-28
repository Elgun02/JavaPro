import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class ArrayStream {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        Optional<Integer> result = list.stream()
                .map(x -> x / 2)
                .filter(x -> x > 25)
                .map(x -> x - 30)
                .sorted()
                .limit(5)
                .reduce((x, y) -> x + y);

        System.out.println(list);
        System.out.println(result);
    }
}