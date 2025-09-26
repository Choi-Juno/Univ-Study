import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하시오: ");
        System.out.println("프로그램을 종료하시려면 q를 입력하시오 ");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do {
            System.out.print("> ");
            inputString = sc.nextLine();
            System.out.println("inputString = " + inputString);
        } while (!inputString.equals("q"));

        sc.close();
    }
}
