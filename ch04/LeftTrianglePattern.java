public class LeftTrianglePattern {
    public static void main(String[] args) {
        int height = 5;

        System.out.println("=== 빗변이 왼쪽인 직각삼각형 ===");
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 0; i < height; i++) {
            // 공백 출력 (i개)
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            // 별 출력 (height - i개)
            for (int star = 0; star < height - i; star++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }

        System.out.println("\n=== 다른 크기로 테스트 ===");
        height = 7;

        for (int i = 0; i < height; i++) {
            // 공백 출력
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int star = 0; star < height - i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n=== 패턴 설명 ===");
        System.out.println("• 1번째 줄: 공백 0개, 별 " + height + "개");
        System.out.println("• 2번째 줄: 공백 1개, 별 " + (height - 1) + "개");
        System.out.println("• 3번째 줄: 공백 2개, 별 " + (height - 2) + "개");
        System.out.println("• ...");
        System.out.println("• " + height + "번째 줄: 공백 " + (height - 1) + "개, 별 1개");
        System.out.println("\n공식:");
        System.out.println("• 공백 개수 = 현재 줄 번호 - 1 (0부터 시작)");
        System.out.println("• 별 개수 = 전체 높이 - 현재 줄 번호");
    }
}
