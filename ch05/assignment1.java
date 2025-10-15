public class assignment1 {
    public static void main(String[] args) {
        String sStudent1 = " math:85, calc:93, science:71 ";
        String sStudent2 = " calc:71, math:88, science:92 ";

        String[] tokens1 = sStudent1.trim().split(",");
        String[] tokens2 = sStudent2.trim().split(",");

        int math1 = Integer.parseInt(tokens1[0].trim().split(":")[1]);
        int calc1 = Integer.parseInt(tokens1[1].trim().split(":")[1]);
        int science1 = Integer.parseInt(tokens1[2].trim().split(":")[1]);

        int math2 = Integer.parseInt(tokens2[1].trim().split(":")[1]);
        int calc2 = Integer.parseInt(tokens2[0].trim().split(":")[1]);
        int science2 = Integer.parseInt(tokens2[2].trim().split(":")[1]);

        double avg_math = (double) (math1 + math2) / 2;
        System.out.println("Tot Math : " + (math1 + math2) + "\t Average : " + avg_math);

        double avg_calc = (double) (calc1 + calc2) / 2;
        System.out.println("Tot Calc : " + (calc1 + calc2) + "\t Average : " + avg_calc);

        double avg_science = (double) (science1 + science2) / 2;
        System.out.println("Tot Science : " + (science1 + science2) + "\t Average : " + avg_science);
    }
}
