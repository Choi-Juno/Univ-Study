public class assignment3 {
    public static void main(String[] args) {
        int[][] score = {
                { 90, 80, 72 }, { 72, 92, 78 }, { 80, 85, 91 }
        };
        String[] subject = { "KOR", "MATH", "ENG" };

        for (int i = 0; i < score.length; i++) {
            int sum = score[i][0] + score[i][1] + score[i][2];
            double avg = (double) sum / 3;

            System.out.println(i + 1 + " Student " + subject[0] + " : " + score[i][0] + " " + subject[1] + " : "
                    + score[i][1] + " " + subject[2] + " : "
                    + score[i][2] + " [ Sum : " + sum + ", Avg : " + avg + " ]");
        }

        for (int i = 0; i < score.length; i++) {
            int sum = score[i][0] + score[i][1] + score[i][2];
            double avg = (double) sum / 3;

            System.out.println(subject[i] + " SUM : " + sum + " AVG : " + avg);
        }
    }
}
