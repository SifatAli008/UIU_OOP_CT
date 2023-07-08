package p2;

public class Vector2D {

    double x, y;

    Vector2D() {
        x = 0;
        y = 0;
    }

    Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D multiply(double realnumber) {
        return new Vector2D(x * realnumber, y * realnumber);
    }

    public double multiply(Vector2D obj) {
        return x * obj.x + y * obj.y;
    }
    
    void display(){
        System.out.println("x : "+x);
         System.out.println("y : "+y);
    }
}
