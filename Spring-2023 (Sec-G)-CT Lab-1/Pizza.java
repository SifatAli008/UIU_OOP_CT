class Pizza {
   double radius;
   double price;

   public void getCost(double radius, double price) {
      System.out.print("Enter radious and price per inch of pizza : ");
      double cast = price * radius;
      System.out.print("Cost of pizza : " + cast);
   }

   public void comparePizza(double  rad [],int unit []) {
      
      double total_area[] = new double[2];
      double area[] = new double[2];
      

      for (int i = 0; i < 2; i++) {
              area[i] =   (double) (3.14 *rad [i] * rad [i]);
          total_area[i] = (double) (area[i]+ unit[i]);  
      }

      if (total_area[0] > total_area[1]) {
         System.out.print("Take pizza 1");

      } else if (total_area[0] < total_area[1]) {
         System.out.print("Take pizza 2");
      }

   }
}