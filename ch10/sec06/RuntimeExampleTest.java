package sec06;

public class RuntimeExampleTest {
    public void process(int value) {
        if (value == 0) {
            throw new RuntimeExceptionTest("0 cannot be processed !!!");
        }
        System.out.println("Success: " + value);
    }
}
