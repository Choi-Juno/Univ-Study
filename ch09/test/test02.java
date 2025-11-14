package test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        // 문제 숫자 생성 (중복 없이)
        int[] question = new int[3];

        for (int i = 0; i < 3; i++) {
            boolean isDuplicate;
            do {
                isDuplicate = false;
                // 첫 번째 숫자는 1-9 범위, 나머지는 0-9 범위
                if (i == 0) {
                    question[i] = (int) (Math.random() * 9) + 1;
                } else {
                    question[i] = (int) (Math.random() * 10);
                }
                // 이전에 생성된 숫자들과 중복 체크
                for (int j = 0; j < i; j++) {
                    if (question[i] == question[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
        }

        // 정답 맞추기
        int[] guess = new int[3];
        Scanner sc = new Scanner(System.in);
        int strike = 0, ball = 0;

        while (true) {
            System.out.print("Input Number (ex: 123) : ");
            String inputNum = sc.nextLine();

            for (int i = 0; i < 3; i++) {
                guess[i] = (inputNum.charAt(i) - '0');
            }

            if (guess[0] == guess[1] || guess[1] == guess[2] || guess[0] == guess[2]) {
                System.out.println("Warning : same number is not allowed...!!");
                continue;
            }
            System.out.println("You get " + strike + " Strike and " + ball + " ball");
            strike = 0;
            ball = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (question[i] == guess[j]) {
                        if (i == j)
                            strike++;
                        else
                            ball++;
                    }
                }
            }

            if (guess == question)
                break;
            if (inputNum.toLowerCase().equals("q"))
                break;

        }
        sc.close();
    }

}
