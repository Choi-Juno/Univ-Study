public class BreakExample {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if (num == 6) {
                System.out.println(i + "번만에 6이 나왔습니다!");
                break;
            }
            i++;
        }
    }
}
