package p4;

public class Marks {

    String id;
    double quizMark;
    double midMark;
    double finalMark;

    public Marks(String id, double quizMark, double midMark, double finalMark) {
        this.id = id;
        this.quizMark = quizMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Quiz Mark : " + quizMark);
        System.out.println("Mid Mark : " + midMark);
        System.out.println("Final Mark : " + finalMark);
    }
}
