import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Saver saver = new Saver();
        saver.save(); 
        System.out.print("Введите положительное число: ");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value <= 0) {
            throw new IllegalAccessException();
        }


    }
}