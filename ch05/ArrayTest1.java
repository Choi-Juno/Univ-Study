public class ArrayTest1 {
    public static void main(String[] args) {
        int[] scores = new int[10];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 10) + 1;
            System.out.print(scores[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 7) {
                System.out.println("7 is " + (i + 1) + "th Number");
            }
        }
    }
}
