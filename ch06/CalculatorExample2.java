public class CalculatorExample2 {
    public static void main(String[] args) {
        Calculator2 myCalc = new Calculator2();

        double result1 = myCalc.areaRectangle(10);
        System.out.println("result1: " + result1);

        double result2 = myCalc.areaRectangle(10, 20);
        System.out.println("result2: " + result2);
    }
}
