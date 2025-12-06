package test1;

import java.util.ArrayList;

public class AnimalExecute3 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog("멍멍이" + (i + 1), i + 1));
        }

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
