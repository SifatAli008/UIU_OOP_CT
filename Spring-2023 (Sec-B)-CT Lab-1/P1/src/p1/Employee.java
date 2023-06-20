package p1;

public class Employee {

    String id;
    String name;
    int age;
    char gender;
    double salary;

    public Employee(String id, String name, int age, char gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    private void same(Employee e) {
        if (this.id.equals(e.id) && this.name.equals(e.name) && this.age == e.age && this.gender == e.gender && this.salary == e.salary) {
            System.out.println("Same");
        }
    }
}
