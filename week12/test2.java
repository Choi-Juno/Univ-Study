import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[][] student = new int[10][2];
        // 국어는 [][0] 수학은 [][1]

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                student[i][j] = (int) (Math.random() * 40) + 61;
            }
        }

        for (int i = 0; i < student.length; i++) {
            int average = (student[i][0] + student[i][1]) / 2;
            System.out.println("Student " + (i + 1) + "   " + "최고점수: " + max(student[i][0], student[i][1]) + "   "
                    + "최저점수: " + min(student[i][0], student[i][1]) + "   " + "평균: " + average);
        }
    }

    public static int max(int korean, int math) {
        if (korean > math) {
            return korean;
        } else {
            return math;
        }
    }

    public static int min(int korean, int math) {
        if (korean < math) {
            return korean;
        } else {
            return math;
        }
    }
}
