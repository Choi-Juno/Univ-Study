import java.util.Scanner;

enum Operator {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE
}

public class enumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. First Val : ");
        int num1 = sc.nextInt();
        System.out.print("2. Second Val : ");
        int num2 = sc.nextInt();
        System.out.print("Insert Operator(PLUS, MINUS, MULTIPLY, DIVIDE) : ");
        String opInput = sc.nextLine().toUpperCase();
        Operator operator = Operator.valueOf(opInput);

        int result = 0;
        switch (operator) {
            case PLUS -> result = num1 + num2;
            case MINUS -> result = num1 - num2;
            case MULTIPLY -> result = num1 * num2;
            case DIVIDE -> result = num1 / num2;
        }

        System.out.println("Result : " + result);
        sc.close();
    }
}
