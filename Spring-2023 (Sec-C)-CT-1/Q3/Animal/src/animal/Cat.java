package animal;

 class Cat {

    String name;
    String color;

    Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

     void makeSound() {
        System.out.println(name + " is meowing");
    }
    
     void display(){
         System.out.println("Cat Name: "+name);
         System.out.println("Cat Color: "+color);
     }
}
