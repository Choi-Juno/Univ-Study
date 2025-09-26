import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        int select = 0;
        int velocity = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("------------------------------");
            System.out.print("선택: ");
            select = sc.nextInt();

            switch (select) {
                case 1 -> {
                    velocity++;
                }
                case 2 -> {
                    velocity--;
                }
                case 3 -> {
                    System.out.println("프로그램 종료");
                    return;
                }
            }
            System.out.println("현재 속도: " + velocity);
        }
    }
}
