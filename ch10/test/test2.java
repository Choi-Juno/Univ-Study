package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int iGuessNo = (int) (Math.random() * 45) + 1;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("숫자 입력: ");
            int input = sc.nextInt();

            if (input > iGuessNo) {
                System.err.println("DOWN");
            } else if (input < iGuessNo) {
                System.out.println("UP");
            } else {
                System.out.println("Right");
                System.out.println("Count = " + count);
                break;
            }
            count++;
        }
        sc.close();
    }
}
