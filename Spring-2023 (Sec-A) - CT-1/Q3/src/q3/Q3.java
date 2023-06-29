package q3;

public class Q3 {
    public static void main(String[] args) {
     GoT ob1 = new GoT();
     ob1.name = "Jhon Snow";
     ob1.house="404";
     
     GoT ob2 = new GoT(4.8);
     ob1.printDetails();
     ob2.printDetails();
    }
}
