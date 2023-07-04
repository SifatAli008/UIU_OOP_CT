package zoo;

public class Animal {

    String name;
    public int legs;

    Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    void print() {
        System.out.println(name + " " + legs);
    }

}
