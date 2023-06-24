package p1;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
public  double  getSalary(){
        return salary;
}

public  double  getAnnualSalary(){
        return 12*salary;
}

public double raiseSalary(int n){
    return (salary * n) / 100 + salary ;
}

}
