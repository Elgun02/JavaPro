public class MessagePrinter {

    public void printInfo() { //  Метод для вывода информационного сообщения о начале игры
        System.out.println("Game started");
        System.out.println("______________");
    }

    public void printFirstNumber() { // Метод для запроса ввода первого числа пользователя
        System.out.print("Enter first number: ");
    }

    public void printSecondNumber() { // Метод для запроса ввода второго числа пользователя
        System.out.print("Enter second number: ");
    }

    public void printWinMessage() { // Метод для вывода сообщения об успешном угадывании
        System.out.println("Guessed right!");
        System.out.println();
    }

    public void printLoseMessage() { // Метод для вывода сообщения об неудачном угадывании
        System.out.println("Did not guess!");
        System.out.println();
    }

    public void printScore(int score) { //  Метод для вывода счета
        System.out.println("You score is: " + score);
    }
}