package p4;
public class HELLO {

    public static void main(String[] args) {
       FB ob1 = new FB();
       ob1.name="Akib Zaman";
       //ob1.clan="Helen"; -- error;
       ob1.clan="Helen";
       
       FB ob2 =new FB(4.8);  
       ob1.printDetails();
       ob2.printDetails();
    }
    
}
