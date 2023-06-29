package q1;

public class Q1 {

    public static void main(String[] args) {
     Student s1 = new Student("CSE212817","Fahim","CSE",4,3.33);
     boolean  result=s1.Thesis_eligibility();
     
     if(result == true){
         System.out.println("Enroll");
     }
     else{
         System.out.println("Can't Enroll");
     }
    }
    
}
