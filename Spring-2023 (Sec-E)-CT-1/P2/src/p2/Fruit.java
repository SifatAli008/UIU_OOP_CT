package p2;

public class Fruit {

    String name;
    double weight;
    double price;
    double totalPrice;

    public Fruit(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void TotalPrice() {
        if (price == 0) {
            totalPrice = price;
        }
        
        totalPrice = price * weight;
    }

    void increasePricePerKG(double num) {
        if (price == 0) {
            totalPrice = price;
        }
        
        totalPrice = price * weight;
        
        double increase = totalPrice;
        totalPrice = increase + num;
    }

    void reducePricePerKG(double num) {
        if (price == 0) {
            totalPrice = price;
        }
     
        totalPrice = price * weight;
        double reduce = totalPrice;
        
        totalPrice = reduce - num;
    }

    void printDetails() {
        System.out.println("Fruit Details: ");
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + "Kg");
        System.out.println("Pricce per kg: " + price);
        System.out.println("Total price: " + totalPrice);
        System.out.println(" ");
    }

}
