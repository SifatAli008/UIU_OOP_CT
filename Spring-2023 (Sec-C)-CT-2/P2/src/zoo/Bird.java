package zoo;

public class Bird extends Animal{
    String color;
    
    public Bird(String name, int legs) {
        super(name, legs);
        this.color=color;
    }
  
    @Override
    void print(){
        System.out.println(name+" "+legs+" "+color);
    }
    
}
