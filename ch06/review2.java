import java.util.Arrays;

public class review2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        boolean isSame = false;
        int index = 0;

        while (true) {
            int random = (int) (Math.random() * 10) + 1;
            isSame = false;

            for (int i = 0; i < index; i++) {
                if (numbers[i] == random) {
                    isSame = true;
                    break;
                }
            }
            if (isSame)
                continue;

            numbers[index++] = random;
            if (index == 10)
                break;
        }

        System.out.println("이전 배열: " + Arrays.toString(numbers));

        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("정렬 후 배열: " + Arrays.toString(numbers));
    }
}
