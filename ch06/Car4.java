public class Car4 {
    int speed;

    void run() {
        System.out.println(speed + "로 달립니다.");
    }

    static void simulate() {
        // this.speed = 20;
        // speed = 10;

        Car4 myCar = new Car4();
        myCar.speed = 100;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate(); // 정적 메소드 호출

        Car4 myCar = new Car4();

        myCar.speed = 60;
        myCar.run();
    }
}
