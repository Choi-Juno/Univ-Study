package sec03_2;

public class BankExample {
    public static void main(String[] args) {
        Bank.Account account = new Bank.Account("홍길동", 1000000);
        Bank.Account account2 = new Bank.Account("이영희", 2000000);

        account.showInfo();
        account2.showInfo();

        account.deposit(500000);
        account2.withdraw(2000);

        account.showInfo();
        account2.showInfo();
    }
}
