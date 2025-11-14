package sec02_1;

public class Car {
    private String model;
    private int horsePower;

    public Car(String model, int horsePower) {
        this.model = model;
        setHorsePower(horsePower);
    }

    public void start() {
        System.out.println(model + " 시동을 겁니다.");
        run();
    }

    public void run() {
        System.out.println("엔진이 가동 중입니다 ! (" + getHorsePower() + "마력)");
    }

    public void stop() {
        System.out.println(model + " 시동을 끕니다.");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

}
