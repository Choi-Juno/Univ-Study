package sec02_1;

public class CarExecute {
    public static void main(String[] args) {
        Car car1 = new Car("쏘나타", 150);
        Car car2 = new Car("K5", 160);

        car1.start();
        car1.stop();

        car2.start();
        car2.stop();
    }
}
