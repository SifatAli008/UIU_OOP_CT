import java.util.Scanner;
public class Food{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a choice: \n 1.Price of Pizze.\n 2.Compare area of Pizza."); 
      int choice = in.nextInt();

      if(choice==1){
            Pizza p1 = new Pizza();
            double radius = in.nextDouble();
            double price = in.nextDouble();
            p1.getCost(radius,price);
      }

      else if (choice == 2) {
       
        double radius[] =  new double[2];
        int unit[] =  new int[2];
        

        for (int i = 0; i < 2; i++) {

            System.out.print("Enter Radius : ");
             radius[i] =  in.nextDouble(); 

            System.out.print("Enter  : ");
             unit[i] =  in.nextInt();   
        }
        Pizza p1 = new Pizza();
        p1.comparePizza(radius, unit);

      in.close();
    }        
 }
}