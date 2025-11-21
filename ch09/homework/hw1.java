package homework;

public class hw1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("3의 배수가 아닌 수의 개수 : " + count);
    }
}
