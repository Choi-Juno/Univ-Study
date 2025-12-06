package Queue;

public class Customer {
    private String name;
    private String job;

    public Customer(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public void showInfo() {
        System.out.println("(Job List: " + job + ")");
    }

    public String getName() {
        return this.name;
    }

}
