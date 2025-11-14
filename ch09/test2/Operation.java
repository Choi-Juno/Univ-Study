package test2;

public class Operation {
    private int a;
    private int b;

    Operation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println("덧셈 결과 : " + (this.a + this.b));
    }

    public void subtract() {
        System.out.println("뺄셈 결과 : " + (this.a - this.b));
    }

    public void multiply() {
        System.out.println("곱셈 결과 : " + (this.a * this.b));
    }

    public void divide() {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.println("나눗셈 결과 : " + ((double) this.a / this.b));
    }
}
