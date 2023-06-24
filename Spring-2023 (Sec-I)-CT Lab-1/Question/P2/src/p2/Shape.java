package p2;

public class Shape {

    int lenght, width;
    double radious;

    void calculate_area(double radious) {
        this.radious = radious;
        System.out.println("The area of the circle is : " + 3.14 * radious * radious);
    }

    void calculate_area(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
        System.out.println("The area of the rectangle is : " + lenght * width);
    }

    void calculate_area(int lenght) {
        this.lenght = lenght;
        System.out.println("The area of the square is : " + lenght * lenght);
    }
}
