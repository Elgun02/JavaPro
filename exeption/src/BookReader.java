import java.io.*;

public class BookReader {
    public static void main(String[] args) {
        File file = new File("book.txt");

        try (FileReader fileReader = new FileReader(file);
              BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String str = bufferedReader.readLine();
            System.out.println(str);
            System.out.println("Всё окей");
        }
        catch (FileNotFoundException e) {
            System.out.println("Не удалось найти файл");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Какие-то проблемы при работе с файлом");
            e.printStackTrace();
        }
    }
}
