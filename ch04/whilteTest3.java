import java.util.Scanner;

public class whilteTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 10) + 1;
        int count = 1;

        do {
            System.out.print("Input Number : ");
            int inputNum = sc.nextInt();
            if (count > 2) {
                System.out.println("Fail!");
                break;
            }
            if (inputNum > randomNum) {
                System.out.println("Down!");
            } else if (inputNum < randomNum) {
                System.out.println("Up!");
            } else {
                System.out.println("Bingo!  You correct in " + count + " Times");
                break;
            }
            count++;
        } while (true);
        sc.close();
    }
}
