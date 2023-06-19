package p1;

public class CupboardNarnia extends Cupboard {
    
       public CupboardNarnia() {

    }

    public CupboardNarnia(int item) {
        super(item);
    }

    @Override
    void open() {
        System.out.println("Open Narnia");
    }
}
