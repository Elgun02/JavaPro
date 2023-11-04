import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Person> people =  bufferedReader.lines()
                .map(Person::new)
                .toList();

        for (Person person : people) {
            System.out.println(person);
        }

    }
}