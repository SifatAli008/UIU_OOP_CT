package p1;

import java.util.Scanner;

public class RoomOfRequirment extends Cupboard {

    private int password;

    public RoomOfRequirment() {

    }

    public RoomOfRequirment(int password, int item) {
        super(item);
        this.password = password;
    }

    void open() {
        Scanner in = new Scanner(System.in);
        password = in.nextInt();

        if (password == 1234) {
            System.out.println("Open room of requirement.");
        } else {
            System.out.println("There is no room of requirment");
        }
    }

}
