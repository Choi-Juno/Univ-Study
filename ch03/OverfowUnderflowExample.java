public class OverfowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }

        System.out.println("--------------------------------");

        byte byte2 = -125;
        for (int i = 0; i < 5; i++) {
            byte2--;
            System.out.println("byte2: " + byte2);
        }
    }
}
