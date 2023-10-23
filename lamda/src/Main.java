import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        BinaryOperator<String> binaryOperator = (x, y) -> x + y;
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        Consumer<Integer> consumer = (x) -> {
            for (int i = 0; i < x; i++) {
                System.out.println("привет");
            }
        };


        System.out.println(function.apply("Jonny"));
        System.out.println(binaryOperator.apply("Jonny", "Marco"));
        System.out.println(supplier.get());
        consumer.accept(5);
    }
}