class Rectangle {
    int length;
    int width;

    Rectangle(int length,int width) {
       this.length = length;
       this.width = width;
    }

   void CalculateArea(){
     int Area = (width*length);
     System.out.println("Area : "+Area);
   }

   void CalculatePerimeter(){
    int Perimeter = 2*(length+width);
    System.out.println("Perimeter : "+Perimeter);
   }
}