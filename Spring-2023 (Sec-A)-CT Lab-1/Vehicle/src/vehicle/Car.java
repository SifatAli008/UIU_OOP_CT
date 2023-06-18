package vehicle;

public class Car {

    double distance;
    double fuel;

    public Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    void mileage() {
        double mileage = distance / fuel;
        System.out.println("Mileage : "+mileage);
    }

    void cost() {
        double cost = fuel * 4;
         System.out.println("Cost : "+cost);
    }

    void Average(int a[]) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += a[i];
        }
        double avarage = sum / 4;
        
          System.out.println("Avarage cost : "+avarage);
    }

}
