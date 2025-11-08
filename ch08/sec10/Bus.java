package sec10;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus is Running");
    }

    public void checkFare() {
        System.out.println("요금을 확인합니다.");
    }
}
