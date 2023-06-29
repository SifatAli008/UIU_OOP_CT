public class Account {
    String name;
    double balance;

    public Account(String name, double balance){
        this.name=name;
        this.balance=balance;
    }

    void increaseBalance(double amount){
        balance += amount;//100+130=230  //200+500=700
    }

    void decreaseBalance(double amount){
        if(amount<= balance){
          balance -= amount;//230-20=210 //700-30=670
        }
    }
}
