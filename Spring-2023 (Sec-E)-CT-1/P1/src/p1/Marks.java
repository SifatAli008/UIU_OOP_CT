package p1;

public class Marks {

    String id;
    double quizMark;
    double midMark;
    double finalMark;

    Marks(String id, double quizMark, double midMark, double finalMark) {
        this.id = id;
        this.quizMark = quizMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    void passedOrNot() {
        
        double totallMark ;

        totallMark = quizMark + midMark + finalMark;
        
        if (totallMark >= 55) {
            System.out.println("Passed.");
        }
        
        else  if(totallMark < 55) {
            System.out.println("Failed.");
        }
        
    }
    
    
}
