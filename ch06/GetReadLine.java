import java.util.Scanner;

public class GetReadLine {
    int GetReadLineNo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number between 1 and 20.");
        int number = sc.nextInt();

        sc.close();
        return number;
    }
}