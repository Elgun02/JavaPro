import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class GenerateWorker {
    public List<Worker> generate() throws FileNotFoundException {
        File file = new File("files/workers.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        return bufferedReader.lines()
                .map(Worker::new)
                .toList();
    }
}
