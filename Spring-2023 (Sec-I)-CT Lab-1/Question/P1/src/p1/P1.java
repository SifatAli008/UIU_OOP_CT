package p1;

public class P1 {

    public static void main(String[] args) {
       Employee e = new Employee("Akil",50000);
        System.out.println("Monthly Salary : "+e.getSalary());
        System.out.println("Annual Salary : "+e.getAnnualSalary());
        System.out.println("Incres Monthly Salary : "+e.raiseSalary(5));
    }
    
}
