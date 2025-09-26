public class WhileTest1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10 - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
