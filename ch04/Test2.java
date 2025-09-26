import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1. Input Value : ");
        int number1 = sc.nextInt();

        System.out.print("2. Input Value : ");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println(number2 + " < " + number1);
        } else {
            System.out.println(number1 + " < " + number2);
        }
        sc.close();
    }
}
