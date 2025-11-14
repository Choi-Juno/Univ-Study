package sec03_2;

public class Bank {
    private static String bankName = "우리은행";

    public static class Account {
        private String owner;
        private int balance;

        public Account(String owner, int balance) {
            this.owner = owner;
            this.balance = balance;
        }

        public void deposit(int amount) {
            balance += amount;
            System.out.println(owner + "님이 " + amount + "원을 입금하였습니다. 잔액은 " + balance + "원입니다.");
        }

        public void withdraw(int amount) {
            if (balance < amount) {
                System.out.println("잔액이 부족합니다.");
                return;
            }
            balance -= amount;
            System.out.println(owner + "님이 " + amount + "원을 출금하였습니다. 잔액은 " + balance + "원입니다.");
        }

        public void showInfo() {
            System.out.println("은행명 : " + bankName);
            System.out.println("예금주 : " + owner);
            System.out.println("잔액 : " + balance);
        }

    }
}
