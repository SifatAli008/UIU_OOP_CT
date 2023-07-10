public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(2023,2,14);
        Date d2 = new Date(2022,8,19);

         
        System.out.println("Previous day of d1 object : "+d1.prevDay());
        System.out.println("Next year of d2 object : "+d2.nextYear());
        System.out.println( d1.isSmaller(d2));   

    }
}
