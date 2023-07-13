public class Q1 {
    public static void main(String[] args) {
        RectangleQ1 rectangle[] = new RectangleQ1[3];
        rectangle[0] = new RectangleQ1(2, 3);
        rectangle[1] = new RectangleQ1(4, 5);
        rectangle[2] = new RectangleQ1(7, 8);

        for (int i = 0; i < rectangle.length; i++) {
            System.out.println("Area of rectangle " + (i + 1) + ": " + rectangle[i].getArea());
        }
    }
}