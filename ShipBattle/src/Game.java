import java.util.Objects;
import java.util.Scanner;

public class Game {
    private final MessagePrinter messagePrinter;
    private final Scanner scanner;
    private int score;

    public Game(MessagePrinter messagePrinter, Scanner scanner) {
        this.messagePrinter = messagePrinter;
        this.scanner = scanner;
        this.score = 0;
    }

    // Метод старта игры
    public void start(Field field) {
        messagePrinter.printInfo();

        // Цикл попыток и вывод информации
        for (int i = 0; i < 10; i++) {
            messagePrinter.printFirstNumber();
            int row = scanner.nextInt();
            messagePrinter.printSecondNumber();
            int column = scanner.nextInt();

            boolean result = field.checkCell(row, column);

            if (result) {
                messagePrinter.printWinMessage();
                score++;
            } else {
                messagePrinter.printLoseMessage();
            }
        }

        messagePrinter.printScore(score);
    }

    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return score == game.score && Objects.equals(messagePrinter, game.messagePrinter) && Objects.equals(scanner, game.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messagePrinter, scanner, score);
    }

    @Override
    public String toString() {
        return "Game{" +
                "messagePrinter=" + messagePrinter +
                ", scanner=" + scanner +
                ", score=" + score +
                '}';
    }
}