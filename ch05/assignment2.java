public class assignment2 {
    public static void main(String[] args) {
        int[] korean = { 90, 94, 87 };
        int[] math = { 72, 92, 78 };
        int[] english = { 80, 85, 91 };

        for (int i = 0; i < korean.length; i++) {
            double avg = (double) (korean[i] + math[i] + english[i]) / 3;
            int sum = korean[i] + math[i] + english[i];
            System.out
                    .println(i + 1 + " Student   KOR : " + korean[i] + "   MATH : " + math[i] + "    ENG : "
                            + english[i] + "    [ SumVal : " + sum + ", Avr : " + String.format("%.2f", avg) + " ]");
        }
        int kor_sum = 0;
        int math_sum = 0;
        int english_sum = 0;
        for (int i = 0; i < korean.length; i++) {
            kor_sum += korean[i];
            math_sum += math[i];
            english_sum += english[i];
        }
        double kor_avg = (double) kor_sum / korean.length;
        double math_avg = (double) math_sum / math.length;
        double english_avg = (double) english_sum / english.length;
        System.out.println(" KOR SUM : " + kor_sum + "  Avr : " + String.format("%.2f", kor_avg));
        System.out.println("MATH SUM : " + math_sum + "  Avr : " + String.format("%.2f", math_avg));
        System.out.println(" ENG SUM : " + english_sum + "  Avr : " + String.format("%.2f", english_avg));
    }
}
