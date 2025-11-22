package test;

public class test3 {
    public static void main(String[] args) {
        int[][] lotto = new int[100][6];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 6; j++) {
                int number = (int) (Math.random() * 45) + 1;
                lotto[i][j] = number;
                // 중복 처리
                for (int k = 0; k < j; k++) {
                    if (lotto[i][k] == number) {
                        j--;
                        break;
                    }
                }
            }
        }
        int hash[] = new int[45];
        int numberIndex[] = new int[45];
        for (int i = 0; i < 45; i++) {
            numberIndex[i] = i + 1;
        }
        // 순회하면서 가장 많은 숫자 찾기
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 6; j++) {
                hash[lotto[i][j] - 1] += 1;
            }
        }

        // Sorting (내림차순)
        for (int i = 0; i < 45; i++) {
            for (int j = i + 1; j < 45; j++) {
                if (hash[i] < hash[j]) {
                    // 횟수 교환
                    int tempHash = hash[i];
                    hash[i] = hash[j];
                    hash[j] = tempHash;

                    // 번호 교환
                    int tempNumber = numberIndex[i];
                    numberIndex[i] = numberIndex[j];
                    numberIndex[j] = tempNumber;
                }
            }
        }

        System.out.print(("가장 많이 나온 번호 6개: "));
        for (int i = 0; i < 6; i++) {
            System.out.print(numberIndex[i] + " ");
        }
        System.out.println();
    }
}
