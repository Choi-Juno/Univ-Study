package test1;

public class Horse extends Animal implements AnimalDoing {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println(name + "run");
    }

    @Override
    public void eat() {
        System.out.println(name + "eat food");
    }

    @Override
    public void bark() {
        System.out.println(name + "bark 히이잉");
    }

    @Override
    public void walk() {
        System.out.println(name + "walk");
    }

    @Override
    public void sit() {
        System.out.println(name + "sit");
    }

    @Override
    public void bite() {
        System.out.println(name + "bite");
    }
}
