import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오: ");
        int num = sc.nextInt();

        String result1 = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";
        boolean result2 = (num % 2 == 0) ? true : false;

        System.out.println(result1 + " " + result2);
    }
}
