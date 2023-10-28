import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Map<Integer, Character> alphabet = new HashMap<>();
        Map<Character, Integer> letterMap = new HashMap<>();
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

        String resultString = stringBuilder.toString();

        for (char c : resultString.toCharArray()) {
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

        System.out.println("Сгенерированная строка: " + resultString);
        System.out.println("Длина строки: " + resultString.length());
        System.out.println("Количество используемых букв: " + letterMap.size());
        System.out.println("Самый часто встречаемый символ: " + mostFrequentChar);

    }
}