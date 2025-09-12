package JavaProgramming.ch02;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f; // 소수점 7자리까지만 확실하고 그 뒤는 근사치로 보여줌
        double var2 = 0.1234567890123456789;
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);

        double var3 = 3e6;
        float var4 = 3e6f;
        double var5 = 2e-3;
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
    }
}
