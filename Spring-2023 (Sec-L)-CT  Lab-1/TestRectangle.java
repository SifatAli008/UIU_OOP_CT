import java.util.Scanner;

class TestRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Area of rectangle.\n2. Perimeter of rectangle.\nPlease enter a choice : ");
        int x = in.nextInt();

        System.out.print("Enter  Length : ");
        int Length = in.nextInt();

        System.out.print("Enter  width : ");
        int width = in.nextInt();

        Rectangle s1 = new Rectangle(width, Length);

        if (x == 1) {
              s1.CalculateArea();
        }
        if (x == 2) {
            s1.CalculatePerimeter();
        }

        in.close();
    }
}