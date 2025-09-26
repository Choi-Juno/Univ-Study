public class forTest1 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            if (i == 7)
                continue;
            System.out.println("*** " + i + "단 ***");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
