package p1;

public class Test {

    public static void main(String[] args) {
        Account account1 = new Account("Sharif", 100);
        Account account2 = new Account("Ahmed", 200);

        System.out.println(account1.name + "  " + account1.balance);
        System.out.println(account2.name + "  " + account2.balance);
        
        account1.increaseBalance(130);
        account1.decreaseBalance(20);
         System.out.println(account1.balance + "  " + account2.balance);
         
         
         account2.increaseBalance(530);
        account1.decreaseBalance(30);
         System.out.println(account1.balance + "  " + account2.balance);
    }
}
