import java.io.*;
import java.util.List;
import java.util.Random;

public class GeneratorPensionFund {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File fileForPensionFundNames = new File("pensionFundNames.txt");
        File fileForGeneratedPensionFund = new File("generatedPensionFund.txt");

        FileReader fileReaderForNames = new FileReader(fileForPensionFundNames);
        FileWriter fileWriterForPensionFund = new FileWriter(fileForGeneratedPensionFund);

        BufferedReader bufferedReaderForNames = new BufferedReader(fileReaderForNames);
        BufferedWriter bufferedWriterForPensionFund = new BufferedWriter(fileWriterForPensionFund);

        List<String> fundNames = bufferedReaderForNames.lines().toList();

        for (int i = 0; i < 100; i++) {
            boolean randomState = random.nextBoolean();

            int nameRandomNumber = random.nextInt(0, fundNames.size());
            String name = fundNames.get(nameRandomNumber);

            String generatedPensionFund = name + ", " + randomState;
            bufferedWriterForPensionFund.write(generatedPensionFund);
            bufferedWriterForPensionFund.newLine();
            bufferedWriterForPensionFund.flush();
        }
    }
}
