public class quiz1 {
    public static void main(String[] args) {
        int apple = 123;
        int applePerBasket = 10;

        int totalBaskets = apple / applePerBasket;
        int remainingApples = apple % applePerBasket;

        if (remainingApples > 0) {
            totalBaskets++;
        }

        System.out.println("Total baskets: " + totalBaskets);
    }
}
