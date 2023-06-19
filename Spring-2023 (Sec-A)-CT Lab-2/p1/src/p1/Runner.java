package p1;

public class Runner {

    public static void main(String[] args) {
        Cupboard c = new Cupboard(5);
        c.open();
        c.additems();
        CupboardNarnia n = new CupboardNarnia();
        RoomOfRequirment r = new RoomOfRequirment();
        n.additems(3);
        r.additems(100);
        Cupboard ref = n;
        ref.open();
        ref = r;
        ref.open();
    }
}
