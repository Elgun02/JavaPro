import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateRandomDate {
    public String generate() {
        Random random = new Random();

        int year = random.nextInt(1900, 2024);
        int month = random.nextInt(12) + 1;
        int maxDay = LocalDate.of(year, month, 1).lengthOfMonth();
        int day = random.nextInt(maxDay) + 1;

        LocalDate randomDate = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return randomDate.format(formatter);
    }
}
