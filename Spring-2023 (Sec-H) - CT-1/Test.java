public class Test {
    public static void main(String[] args){
        BankAccount gatesAccount;                                                           //1 
         
        gatesAccount = new BankAccount("Bill Gates",500.0);         //2  
        BankAccount  jobsAccount = new BankAccount("Steve",0.0);    //3

        gatesAccount.withdraw(150.0);
        jobsAccount.deposit(400.0);

        System.out.println(gatesAccount.getName()+" "+gatesAccount.getBalance());
        System.out.println(jobsAccount.getName()+" "+jobsAccount.getBalance());
        jobsAccount = null;

    }
}
