import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(("regExCode")));
        StringBuilder stringBuilder = new StringBuilder();

        while (bufferedReader.ready()) {
            stringBuilder.append(bufferedReader.readLine()).append("\n");
        }

        String code = stringBuilder.toString();

// 1) Найти все boolean переменные.

        System.out.println("1:");
        String first = "\\b(true|false)";

        Pattern firstPattern = Pattern.compile(first);
        Matcher firstMatcher = firstPattern.matcher(code);

        while (firstMatcher.find()) {
            System.out.println(firstMatcher.group());
        }

// 2) Найти версию приложения.

        System.out.println();
        System.out.println("2:");

        String second = "\"version\": (\\d+)";
        Pattern secondPattern = Pattern.compile(second);
        Matcher secondMatcher = secondPattern.matcher(code);

        while (secondMatcher.find()) {
            System.out.println(secondMatcher.group(1));
        }

// 3) Найти все поля, в названии которых есть слово "normalizer".

        System.out.println();
        System.out.println("3:");

        String third = "\\S.*normalizer.*";
        Pattern thirdPattern = Pattern.compile(third);
        Matcher thirdMatcher = thirdPattern.matcher(code);

        while (thirdMatcher.find()) {
            System.out.println(thirdMatcher.group());
        }
    }
}