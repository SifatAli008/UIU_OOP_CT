package p1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("");
        int num = in.nextInt();

        Employee e[] = new Employee[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter 1st user info.");

            System.out.print("Enter Emplyee id : ");
            String id = in.next();

            System.out.print("Enter Emplyee name : ");
            String name = in.next();

            System.out.println("Enter Emplyee age : ");
            int age = in.nextInt();

            System.out.println("Enter Emplyee age : ");
            char gender = in.next().charAt(0);

            System.out.println("Enter Emplyee age : ");
            double salary = in.nextDouble();

            e[i] = new Employee(id, name, age, gender, salary);
        }
    }

}
