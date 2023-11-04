import java.io.*;
import java.util.List;
import java.util.Random;

public class Generator {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File FileForName = new File("name.txt");
        File FileForSurname = new File("surname.txt");
        File file = new File("file.txt");

        FileReader fileReaderForName = new FileReader(FileForName);
        FileReader fileReaderForSurname = new FileReader(FileForSurname);
        FileWriter fileWriter = new FileWriter(file);

        BufferedReader bufferedReaderForName = new BufferedReader(fileReaderForName);
        BufferedReader bufferedReaderForSurname = new BufferedReader(fileReaderForSurname);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<String> names = bufferedReaderForName.lines().toList();
        List<String> surnames = bufferedReaderForSurname.lines().toList();

        for (int i = 0; i < 10000; i++) {
            int age = random.nextInt(18, 80);

            int nameRandomNumber = random.nextInt(0, names.size());
            String name = names.get(nameRandomNumber);

            int surnameRandomNumber = random.nextInt(0, surnames.size());
            String surname = surnames.get(surnameRandomNumber);

            String generatedString = name + " " +  surname + " " + age;
            bufferedWriter.write(generatedString);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }
    }
}
