package homework;

public class hw2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("7의 배수의 개수 : " + count);
    }
}
