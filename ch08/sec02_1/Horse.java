package sec02_1;

public class Horse implements Animal {
    @Override
    public void run() {
        System.out.println("Horse is running.");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping.");
    }
}
