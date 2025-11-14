package test2;

public class Calculator {
    public void calculate(int a, int b) {

        Operation op = new Operation(a, b);
        op.add();
        op.subtract();
        op.multiply();
        op.divide();
    }

    public static void main(String[] args) {
        new Calculator().calculate(10, 3);
    }
}
