import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateFormatMain {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(dateFormatter));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.format(timeFormatter));

        DateTimeFormatter parseFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDateParse = LocalDate.parse("2023/11/15", parseFormatter);
//        System.out.println(localDateParse.);

    }
}
