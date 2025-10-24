package sec11;

public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person();
        Manager m = new Manager();
        Employee e = new Employee();
        Director d = new Director();

        p.work();
        m.work();
        e.work();
        d.work();
    }
}
