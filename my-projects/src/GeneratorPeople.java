import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorPeople {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File fileForName = new File("popularNames.txt");

        FileReader fileReaderForNames = new FileReader(fileForName);
        FileWriter fileWriterForPeople = new FileWriter("people.txt");

        BufferedReader bufferedReaderForNames = new BufferedReader(fileReaderForNames);
        BufferedWriter bufferedWriterForPeople = new BufferedWriter(fileWriterForPeople);

        List<String> names = bufferedReaderForNames.lines().toList();
        List<Gender> genders = new ArrayList<>();
        genders.add(Gender.FEMALE);
        genders.add(Gender.MALE);

        for (int i = 0; i < 10000; i++) {
            int randomGender = random.nextInt(0, 2);

            int minSalary = 0;
            int maxSalary = 0;

            int randomMinSalary = random.nextInt(0, 9999);
            int randomMaxSalary = random.nextInt(0, 9999);

            if (randomMinSalary < randomMaxSalary) {
                minSalary = (randomMinSalary / 10) * 10;
                maxSalary = (randomMaxSalary / 10) * 10;
            } else {
                minSalary = (randomMaxSalary / 10) * 100;
                maxSalary = (randomMinSalary / 10) * 100;
            }

            int nameRandomNumber = random.nextInt(0, names.size());
            String name = names.get(nameRandomNumber);

            String generatedWorker = name + " " + minSalary + " " + maxSalary + " " + genders.get(randomGender);
            bufferedWriterForPeople.write(generatedWorker);
            bufferedWriterForPeople.newLine();
            bufferedWriterForPeople.flush();
        }
    }
}
