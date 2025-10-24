package test1;

public class Motocycle extends Vehicle {
    public Motocycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(this.brand + "는 일반 도로를 달립니다.");
    }
}
