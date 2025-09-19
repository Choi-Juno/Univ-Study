import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1. input Val : ");
        int iVal_1 = sc.nextInt();
        System.out.print("2. input Val : ");
        int iVal_2 = sc.nextInt();

        System.out.println("iVal_1 + iVal_2 = " + (iVal_1 + iVal_2));
    }
}
