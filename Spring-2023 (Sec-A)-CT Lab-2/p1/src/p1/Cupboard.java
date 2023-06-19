package p1;

public class Cupboard {

    static int item;

    public Cupboard() {

    }

    public Cupboard(int item) {
        Cupboard.item = item;
    }

    void additems() {
        item++;
        System.out.println(item);
    }

    void additems(int num) {
        item += num ;
        System.out.println(item);
    }

    void open() {
        System.out.println("Cupboard open");
    }
}
