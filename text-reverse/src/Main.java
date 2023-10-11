import java.util.Stack;

public class Main {
    public static void main (String[]args){
        String str = "Привет, мир";
        reverse(str);
    }
    public static void reverse(String str) {
        str = str.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            if (stack.size() == 5 || i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
            }
        }
    }
}