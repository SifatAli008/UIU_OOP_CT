public class MultipliP1 {
    int a;
    int b;
    double c;
    double d;

    MultipliP1(){
        System.out.println("Multiplication of two Integer : 0 ");
    }

    MultipliP1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Multiplication of two Integer : " + a * b);
    }

    MultipliP1(double c, double d) {
        this.c = c;
        this.d = d; 
        System.out.println("Multiplication of two double : " + c * d);
    }
    
}
