package q1;

public class Student {

    String studentId;
    String name;
    String department;
    int year;
    double cgpa;

    Student(String studentId, String name, String department, int year, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.year = year;
        this.cgpa = cgpa;
    }

    public boolean Thesis_eligibility() {
        if (cgpa >= 3.50) {
           return true;
        }
        else{
            return  false;
        }
    }
}
