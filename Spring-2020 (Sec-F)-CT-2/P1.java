import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = in.nextInt();

        System.out.println(" ");

        System.out.print("Enter first number : ");
        int num2 = in.nextInt();

        System.out.println(" ");
        
        MultipliP1 ob1 = new MultipliP1(num1, num2);

        MultipliP1 ob2 = new MultipliP1((double)num1,(double)num2);

        MultipliP1 ob3 = new MultipliP1();

        

        in.close();
    }
}