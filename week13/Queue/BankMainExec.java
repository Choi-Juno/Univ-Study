package Queue;

public class BankMainExec {
    public static void main(String[] args) {
        BankQueue bankQueue = new BankQueue();

        bankQueue.addCustomer(new Customer("홍길동", "예금"));
        bankQueue.addCustomer(new Customer("김철수", "출금"));
        bankQueue.addCustomer(new Customer("강감찬", "적금가입"));

        bankQueue.nextCustomer();
    }
}
