import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = in.nextInt();
        System.out.print("Enter the number of column : ");
        int col = in.nextInt();

        StarPrint s1 = new StarPrint(row,col);
        s1.patternPrint();
    }
}
