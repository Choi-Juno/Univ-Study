import java.util.Scanner;

public class review1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random() * 20) + 1;
        int count = 1;

        while (true) {
            System.out.println("Input a number between 1 and 20");
            int guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Down!");
            } else if (guess < number) {
                System.out.println("Up!");
            } else {
                System.out.println("Bingo!");
                System.out.println("You passed the Quiz, " + count + "th try");
                break;
            }
            count++;
        }
        sc.close();
    }
}