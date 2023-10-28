import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class Interfaces {
    public static void main(String[] args) {

        // Functional. Принимает строку, находит в ней самый часто встречаемый символ и отдает ее.
        Functional<String> functional = new Functional<String>() {
            @Override
            public char apply(String str) {
                Map<Character, Integer> letterMap = new HashMap<>();
                for (char c : str.toCharArray()) {
                    letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
                }

                char mostFrequentChar = ' ';
                int maxCount = 0;
                for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
                    if (entry.getValue() > maxCount) {
                        mostFrequentChar = entry.getKey();
                        maxCount = entry.getValue();
                    }
                }

                return mostFrequentChar;
            }
        };

        // Supplier. Ничего не принимает, отдает случайно сгенерированную строку.
        Supplier supplier = () -> {
            Random random = new Random();

            Map<Integer, Character> alphabet = new HashMap<>();
            for (int i = 0; i < 26; i++) {
                alphabet.put(i, (char) ('A' + i));
            }

            int stringLength = random.nextInt(100);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < stringLength; i++) {
                int randomNum = random.nextInt(26);
                char randomLetter = alphabet.get(randomNum);
                stringBuilder.append(randomLetter);
            }

            return stringBuilder.toString();
        };

        String str = supplier.get().toString();
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(functional.apply(str));

    }
}
