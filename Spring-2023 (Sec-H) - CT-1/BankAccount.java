public class BankAccount {
    private String name;
    private double balance;

    BankAccount(String _name, double initialDepositl) {
        name = _name;
        balance = initialDepositl;
    }

    void deposit(double amount) {
       balance = balance + amount;
    }
    
    void withdraw(double amount) {
        if(amount <= balance){
            balance = balance - amount;
        }
    }

    double getBalance() {
        return balance;
    }

    String getName() {
        return name;
    }

}
