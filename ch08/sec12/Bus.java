package sec12;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus is running.");
    }

    public void checkFare() {
        System.out.println("요금을 확인합니다.");
    }
}
