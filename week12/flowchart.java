import java.util.Scanner;

public class flowchart {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        char op = '+';

        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        num1 = sc.nextInt();
        while (true) {
            System.out.print("Operator: ");
            op = sc.next().charAt(0);
            if (op == 'q') {
                break;
            }
            System.out.print("Num2: ");
            num2 = sc.nextInt();
            if (num2 == 0 && op == '/') {
                System.out.println("Error: Division by zero");
                continue;
            }

            switch (op) {
                case '+':
                    result = result + num2;
                    break;
                case '-':
                    result = result - num2;
                    break;
                case '*':
                    result = result * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    result = result / num2;
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }

            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
