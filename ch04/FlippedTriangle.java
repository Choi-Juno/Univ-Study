public class FlippedTriangle {
    public static void main(String[] args) {
        int height = 5;

        System.out.println("=== 원본: 좌직각삼각형 ===");
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= height; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== Y축 뒤집기: 우직각삼각형 ===");
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= height; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== 원본: 정삼각형 ===");
        // *
        // ***
        // *****
        // *******
        // *********
        for (int i = 1; i <= height; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== Y축 뒤집기: 정삼각형 (오른쪽 정렬) ===");
        // *
        // ***
        // *****
        // *******
        // *********
        for (int i = 1; i <= height; i++) {
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== 원본: 역좌직각삼각형 ===");
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 0; i < height; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < height - i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== Y축 뒤집기: 역우직각삼각형 ===");
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = height; i >= 1; i--) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== 원본: 다이아몬드 ===");
        // *
        // ***
        // *****
        // *******
        // *********
        // *******
        // *****
        // ***
        // *

        // 위쪽 삼각형
        for (int i = 1; i <= height; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형
        for (int i = height - 1; i >= 1; i--) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== Y축 뒤집기: 다이아몬드 (왼쪽 정렬) ===");
        // *
        // ***
        // *****
        // *******
        // *********
        // *******
        // *****
        // ***
        // *

        // 위쪽 삼각형
        for (int i = 1; i <= height; i++) {
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형
        for (int i = height - 1; i >= 1; i--) {
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== 설명 ===");
        System.out.println("Y축 뒤집기란?");
        System.out.println("• 세로축(Y축)을 기준으로 좌우를 바꾸는 것");
        System.out.println("• 왼쪽에 있던 것이 오른쪽으로, 오른쪽에 있던 것이 왼쪽으로");
        System.out.println("• 공백이 있던 자리에는 별이, 별이 있던 자리는 공백 제거");
        System.out.println("\n변환 규칙:");
        System.out.println("• 좌직각삼각형 → 우직각삼각형");
        System.out.println("• 역좌직각삼각형 → 역우직각삼각형");
        System.out.println("• 가운데 정렬 정삼각형 → 왼쪽 정렬 정삼각형");
    }
}
