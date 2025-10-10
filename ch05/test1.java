import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 10) + 1;
        String strNumber = String.valueOf(number);
        int count = 0;

        while (true) {
            System.out.println("Input a number between 1 and 10");
            String guess = sc.nextLine();
            count++;

            if (count == 3) {
                System.out.println("You lost");
                break;
            }
            if (!guess.equals(strNumber)) {
                System.out.println("Incorrect");
            } else {
                System.out.println("Correct");
                break;
            }
        }
        sc.close();
    }
}
