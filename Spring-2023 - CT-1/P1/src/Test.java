public class Test {
    public static void main(String[] args) throws Exception {
    
       Account account1 = new Account("Sharif",100);
       Account account2 = new Account("Ahmed",200);

       System.out.println(account1.name+" "+account1.balance);
       System.out.println(account2.name+" "+account2.balance);

       account1.increaseBalance(130);
       account1.decreaseBalance(20);
       System.out.println(account1.balance+" "+account2.balance);//balance1:210 balance2:200
    
       account2.increaseBalance(500);
       account2.decreaseBalance(30);
       System.out.println(account1.balance+" "+account2.balance);//balance1:210 balance2:670
    
    }
}
