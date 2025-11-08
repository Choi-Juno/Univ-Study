package sec02_1;

public class AnimalExample {
    public static void main(String[] args) {
        animalAction(new Dog());
        animalAction(new Cat());
        animalAction(new Horse());
    }

    public static void animalAction(Animal animal) {
        animal.run();
        animal.eat();
        animal.sleep();
    }
}
