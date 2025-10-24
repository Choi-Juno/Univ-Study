package sec11;

public sealed class Person permits Employee, Manager {
    public String name;

    public void work() {
        System.out.println("하는 일이 정해지지 않았습니다.");
    }
}
