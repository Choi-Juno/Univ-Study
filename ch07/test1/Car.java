package test1;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(this.brand + "는 고속도로를 달립니다.");
    }
}
