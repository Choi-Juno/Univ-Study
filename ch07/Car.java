public class Car {
    private int speed;
    private boolean stop;

    // speed 필디의 Getter/Setter 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    // stop 필디의 Getter/Setter 선언
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
