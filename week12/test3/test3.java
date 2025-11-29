package test3;

public class test3 {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            int[] scores = new int[5];
            for (int j = 0; j < scores.length; j++) {
                scores[j] = (int) (Math.random() * 40) + 61;
            }
            students[i] = new Student("A" + (i + 1), i + 1, scores);
        }

        students = sortStudents(students);

        System.err.println("================== 학생 성적 관리 시스템 (총점 높은 순) ==================");
        System.err.println("이름\t| 학번\t| 국어\t| 영어\t| 수학\t| 과학\t| 사회\t| 총점\t| 평균");
        System.err.println(
                "------------------------------------------------------------------------------------------------");
        for (Student student : students) {
            student.printInfo();
        }
        System.err.println(
                "------------------------------------------------------------------------------------------------");
    }

    public static Student[] sortStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getTotal() < students[j].getTotal()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        return students;
    }
}
