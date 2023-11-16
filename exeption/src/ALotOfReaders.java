import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ALotOfReaders {
    public static void main(String[] args) throws IOException {
        File file = new File("book.txt");
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            FileWriter fileWriter = new FileWriter(file);

            int a = random.nextInt();
            fileWriter.write(a);
            fileWriter.flush();
        }
    }
}
