package p1;

public class Course {

    String name, id;
    int credit;

    public Course(String name, String id, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public void display() {
        System.out.printf("%s-%s-%d\n", name, id, credit);
    }

    public void updateCourse(Course c1) {
         this.name=c1.name;//SPL
         this.id=c1.id;//CSI121
         c1.credit--;//0
    }
}
