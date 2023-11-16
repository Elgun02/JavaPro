import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateProgram {
    public static void main(String[] args) {
        System.out.print("Введите любую дату: ");

        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println("Вы ввели " + localDate);

        if (localDate.isBefore((LocalDate.now()))) {
            System.out.println("Вы ввели дату в прошлом");
        }
        else {
            System.out.println("Вы ввели дату в будущем");
        }
    }
}
