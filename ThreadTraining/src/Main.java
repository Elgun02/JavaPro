import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time time = new Time();

        Thread threadSeconds = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10_000);
                    time.threadSeconds();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadMinutes = new Thread(() -> {
           while (true) {
               try {
                   Thread.sleep(60_000);
                   time.threadMinutes();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });

        threadSeconds.start();
        threadMinutes.start();

        System.out.println("\u001B[34mНапишите\u001B[0m \u001B[31m'/time'\u001B[0m \u001B[34m- чтобы узнать сколько прошло времени.\u001B[0m");
       while (true) {
           System.out.print("\u001B[32mConsole: \u001B[0m");
           String input = sc.next();
           if (input.equals("/time")) {
               System.out.println("Прошло " + time.getHours() + " час, " + time.getMinutes() + " минут, " + time.getSeconds() + " секунд");
           } else if (input.equals("/clear")) { // <- clear console.
               time.clear();
           } else if (input.equals("3769")) { // скрытый пароль для разблокировки основного потока :)                                           <-  Пасхалка
               System.out.println("\u001B[33mОсновной поток разблокирован!\u001B[0m");
           } else {
               System.out.println("\u001B[31mcommand not found\u001B[0m");
           }
       }
    }
}