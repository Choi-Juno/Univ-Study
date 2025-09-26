import java.util.Scanner;

public class Review2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Input Integer value : ");
        int iFstVal = sc.nextInt();

        System.out.println("2. Input Integer value : ");
        int iSecVal = sc.nextInt();

        System.out.println("Input iFstVal = " + iFstVal);
        System.out.println("Input iSecVal = " + iSecVal);

        int temp = iFstVal;
        iFstVal = iSecVal;
        iSecVal = temp;

        System.out.println("Output iFstVal = " + iFstVal);
        System.out.println("Output iSecVal = " + iSecVal);

        sc.close();
    }
}
