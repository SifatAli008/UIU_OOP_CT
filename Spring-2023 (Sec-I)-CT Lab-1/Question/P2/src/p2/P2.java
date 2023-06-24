package p2;

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape s = new Shape();

        System.out.print("Enter Shape (cricle,square,rectangle) : ");
        String choice = in.next();

        if (choice.equals("cricle")) {
            System.out.print("Enter radius : ");
            double num = in.nextDouble();
            s.calculate_area(num);
        } else if (choice.equals("rectangle")) {
             System.out.print("Enter lenght  : ");
            int num1 = in.nextInt();
             System.out.print("Enter width  : ");
            int num2 = in.nextInt();
            s.calculate_area(num1, num2);
        } else if (choice.equals("square")) {
            System.out.print("Enter lenght  : ");
            int num = in.nextInt();
            s.calculate_area(num);
        }
    }

}
