import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CreateObject {

    public void generate() throws FileNotFoundException {
        File file = new File("people.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Worker> workers = bufferedReader.lines()
                .map(Worker::new)
                .toList();

        for (Worker worker : workers) {
            System.out.println(worker);
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Worker> workers = bufferedReader.lines()
                .map(Worker::new)
                .toList();

        for (Worker worker : workers) {
            System.out.println(worker);
        }

    }
}
