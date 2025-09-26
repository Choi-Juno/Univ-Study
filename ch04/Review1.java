public class Review1 {
    public static void main(String[] args) {
        int apple = 123;
        int bundle = 10;

        int applePerBundle = apple / bundle;
        int remainingApple = apple % bundle;

        if (remainingApple > 0) {
            applePerBundle++;
        }

        System.out.println("1. Total Need Bundle Count : " + applePerBundle + " cnt");
    }
}
