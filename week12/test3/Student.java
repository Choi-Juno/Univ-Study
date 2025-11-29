package test3;

public class Student {
    private String name;
    private int studentNumber;
    private int[] scores;
    private int total;
    private double average;

    public Student(String name, int studentNumber, int[] scores) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.scores = scores;
        this.total = total(scores);
        this.average = average(scores);
    }

    public int total(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public double average(int[] scores) {
        int total = total(scores);
        double average = (double) total / scores.length;
        return average;
    }

    public int getTotal() {
        return this.total;
    }

    public void printInfo() {
        System.out.println(this.name + "\t| " + this.studentNumber + "\t| " + this.scores[0] + "\t| " + this.scores[1]
                + "\t| " + this.scores[2] + "\t| " + this.scores[3] + "\t| " + this.scores[4] + "\t| " + this.total
                + "\t| "
                + this.average);
    }

    public static void main(String[] args) {
        Student students = new Student("A1", 1, new int[] { 90, 85, 95, 80, 90 });
        students.printInfo();
    }
}
