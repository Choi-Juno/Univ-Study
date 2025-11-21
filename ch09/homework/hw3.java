package homework;

import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.print("Input 4 Number : ");
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < 4; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numbers);

        System.out.println("큰 순서대로 : " + numbers[3] + " " + numbers[2] + " " + numbers[1] + " " + numbers[0]);

    }
}
