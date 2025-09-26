import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number 1 : ");
        int iVal_1 = sc.nextInt();

        System.out.print("Input Number 2 : ");
        int iVal_2 = sc.nextInt();

        System.out.print("Input Operator : ");
        String sOperator = sc.next();

        switch (sOperator) {
            case "+" -> {
                System.out.println(iVal_1 + iVal_2);
            }
            case "-" -> {
                System.out.println(iVal_1 - iVal_2);
            }
            case "*" -> {
                System.out.println(iVal_1 * iVal_2);
            }
            case "/" -> {
                if (iVal_2 == 0) {
                    System.out.println("Error: divide by 0");
                    break;
                }
                System.out.println(iVal_1 / iVal_2);
            }
        }
        sc.close();
    }
}
