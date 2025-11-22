package sec06;

public class CheckedExecute {
    public static void main(String[] args) {
        CheckedExample example = new CheckedExample();

        try {
            example.dowork(-10);
        } catch (CheckedExcpetion e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
