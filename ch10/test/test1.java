package test;

public class test1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                int number = i + j;
                if (number > 10) {
                    number -= 10;
                }
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
