import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
        Random random = new Random();
        String name = "Jonny";
        String surname = "Marco";

        Functional functional = String::length;
        BinaryOperator<String> binaryOperator = (x, y) -> x + y;
        Supplier<Integer> supplier = () -> random.nextInt(10);
        Consumer<Integer> consumer = (x) -> {
            for (int i = 0; i < x; i++) {
                System.out.println("привет");
            }
        };

        System.out.println(functional.accept(name));
        System.out.println(binaryOperator.apply(name, surname));
        System.out.println(supplier.get());
        consumer.accept(5);

    }
}
