public class test2 {
    public static void main(String[] args) {
        String sTot = "10Point, 23Point, 33Point, 45Point, 55Point, 67Point";
        String[] tokens = sTot.split(",");
        String[] points = new String[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            points[i] = tokens[i].trim().replace("Point", "");
        }

        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += Integer.parseInt(points[i]);
        }

        double avg = (double) sum / points.length;

        System.out.println("1. TotCnt: " + points.length);
        System.out.println("2. SumValue: " + sum);
        System.out.println("3. Average: " + avg);
        System.out.println("4. Average: " + String.format("%10.2f", avg));
    }
}
