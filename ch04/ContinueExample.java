public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        int i = 1;
        while (i <= 10) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
