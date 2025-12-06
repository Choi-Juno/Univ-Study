package test1;

public class AnimalExecute2 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog("멍멍이" + (i + 1), i + 1);
        }

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
