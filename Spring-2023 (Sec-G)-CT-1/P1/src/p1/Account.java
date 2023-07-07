
package p1;

public class Account {
    String name;
    double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    void increaseBalance(int amount){
    balance+=amount;
    }
    
        void decreaseBalance(int amount){
         if(amount <=balance){
             balance -=amount;
         }
    }
   
    
}
