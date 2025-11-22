package sec06;

public class CheckedExample {
    public void dowork(int value) throws CheckedExcpetion {
        if (value < 0) {
            throw new CheckedExcpetion("It is not allowed...");
        }
        System.out.println("Success: " + value);
    }
}
