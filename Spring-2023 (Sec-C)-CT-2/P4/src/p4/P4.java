package p4;

public class P4 {

    public static void main(String[] args) {
        Myclass m1 = new Myclass(10, 20);
        Myclass m2 = new Myclass(20, 10);
        Myclass m3 = new Myclass(20, 20);

        m1 = m3;
        m3 = m2;
        m1.print();
        m2.print();
        m2 = m1;
        m3 = m2;
        m2.print();
        m3.print();

    }
}
