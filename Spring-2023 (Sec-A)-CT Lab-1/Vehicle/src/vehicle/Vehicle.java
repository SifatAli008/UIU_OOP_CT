package vehicle;

import java.util.Scanner;

public class Vehicle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Mileage of Car.");
        System.out.println("2. Cost of fuel.");
        System.out.println("3. Maximum Cost.");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        System.out.print("Enter Distance : ");
        double Distance = in.nextDouble();

        System.out.print("Enter Fuel : ");
        double Fuel = in.nextDouble();

        Car c1 = new Car(Distance, Fuel);

        if (choice == 1) {
            c1.mileage();
        } else if (choice == 2) {
            c1.cost();
        } else if (choice == 3) {
            int a[] = new int[4];

            for (int i = 0; i < 4; i++) {
                System.out.print("Enter " + (i + 1) + " value : ");
                
                a[i] = in.nextInt();
            }
            c1.Average(a);
        }

    }

}
