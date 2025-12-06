package test1;

public class AnimalExecute {
    public static void main(String[] args) {
        Dog dog = new Dog("바둑이", 3);
        dog.eat();
        dog.bark();
        dog.run();

        Cat cat = new Cat("나비", 2);
        cat.eat();
        cat.bark();

        Horse horse = new Horse("적토마", 4);
        horse.run();
        horse.bite();
    }
}
