package p3;

public class BankAccount {

    private String account_number;
    private String account_holder_name;
    private double balance;

    public BankAccount(String account_number, String account_holder_name, double balance) {
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.balance = balance;
    }

    void deposit(int add) {
        this.balance = balance + add;
    }

    void withDrow(int sub) {
        this.balance = balance - sub;
    }

    void checkBalance() {
        System.out.println(balance);
    }

}
