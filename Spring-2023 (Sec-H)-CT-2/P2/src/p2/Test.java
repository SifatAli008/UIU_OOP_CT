package p2;

public class Test {

    public static void main(String[] args) {
        Vector2D ob1 = new Vector2D(5, 4);
        Vector2D x = ob1.multiply(7);
         x.display();
        

        Vector2D ob2 = new Vector2D(1, 4);
        System.out.println(ob2.multiply(ob1));

    }

}
