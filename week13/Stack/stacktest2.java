package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stacktest2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        char ch = ' ';
        String str = "";
        while (true) {
            ch = scanner.next().charAt(0);
            if (Character.toLowerCase(ch) == 'q') {
                break;
            }
            stack.push(ch);
            str += stack.peek();
        }
        System.out.println("===================================");
        System.out.println(str);
        System.out.println("===================================");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        scanner.close();
    }
}
