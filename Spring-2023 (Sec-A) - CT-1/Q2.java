import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
       int result = (int) avg(num1,num2,num3);
       System.out.println("Average of three number : " + result);

       in.close();
    }

    public static double avg(int a,int b ,int c){
    double avrage = (a+b+c)/3;

     return avrage;
    }
}