import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratePensionFund {
    public List<PensionFund> generate() throws FileNotFoundException {
        File file = new File("files/pensionFunds.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<PensionFund> pensionFunds = bufferedReader.lines()
                .map(PensionFund::new)
                .toList();

        GenerateWorker generateWorker = new GenerateWorker();
        List<Worker> workerList = generateWorker.generate();

        Random random = new Random();
        GenerateRandomDate generateRandomDate = new GenerateRandomDate();
        for (PensionFund pensionFund : pensionFunds) {
            int randomMembersSize = random.nextInt(workerList.size());
            String date = generateRandomDate.generate();

            List<Worker> workers = new ArrayList<>();
            for (int i = 0; i < randomMembersSize; i++) {
                int randomWorkerIndex = random.nextInt(workerList.size());
                workers.add(workerList.get(randomWorkerIndex));
            }

            pensionFund.setMembersList(workers);
            pensionFund.setDateOfCreation(date);
        }

        return pensionFunds;
    }
}

