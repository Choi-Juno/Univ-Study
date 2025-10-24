package test1;

public class MoveExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("차량");

        vehicle = new Car("자동차");
        vehicle.move();

        vehicle = new Motocycle("오토바이");
        vehicle.move();
    }
}
