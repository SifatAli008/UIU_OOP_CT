
package p3;

 import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     
     BankAccount bank_account = new BankAccount("12345", "John Doe", 1000.0);

      bank_account.deposit(500);
      bank_account.withDrow(200);
      bank_account.checkBalance();

    }
    
}
