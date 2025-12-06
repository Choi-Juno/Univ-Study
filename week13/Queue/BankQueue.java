package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    private Queue<Customer> queue;

    public BankQueue() {
        queue = new LinkedList<>();
    }

    public void addCustomer(Customer c) {
        queue.offer(c);
        System.out.println("Register Customer: " + c.getName());
    }

    public void nextCustomer() {
        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            System.out.print("Next Customer: " + c.getName());
            c.showInfo();
        }
        System.out.println("End of jobs");
    }
}
