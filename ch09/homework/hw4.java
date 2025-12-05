package homework;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number : ");
        num1 = sc.nextInt();
        System.out.print("Input Number : ");
        num2 = sc.nextInt();

        System.out.println("1. 덧셈");
        System.out.println("2. 뺄셈");
        System.out.println("3. 곱셈");
        System.out.println("4. 나눗셈");
        System.out.print("Select Menu : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("덧셈 결과 : " + (num1 + num2));
                break;
            case 2:
                System.out.println("뺄셈 결과 : " + (num1 - num2));
                break;
            case 3:
                System.out.println("곱셈 결과 : " + (num1 * num2));
                break;
            case 4:
                System.out.println("나눗셈 결과 : " + ((double) num1 / num2));
                break;
        }
        sc.close();
    }
}
