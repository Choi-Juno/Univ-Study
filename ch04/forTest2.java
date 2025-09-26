class forTest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int space = 1; space <= 10 - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
