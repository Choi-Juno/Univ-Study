public class SwitchTest1 {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 12) + 1;

        System.out.println("[ " + month + "월 ]");
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("31일");
            }
            case 4, 6, 9, 11 -> {
                System.out.println("30일");
            }
            case 2 -> {
                System.out.println("28일");
            }
        }
    }
}
