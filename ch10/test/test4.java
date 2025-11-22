package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        String number = sc.nextLine();

        try {
            System.out.println("number: " + Integer.parseInt(number));
        } catch (NumberFormatException e) {
            System.out.println("It's not a Number!!");
            e.printStackTrace();
        }

        sc.close();
    }
}