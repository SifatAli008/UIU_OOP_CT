
package p1;


public class InheritanceTest {

    public static void main(String[] args) {
       Ebook java = new Ebook();
      int chapters = 8 , pages = 500;
      Ebook c = new Ebook(chapters,pages,"pdf");
      Book b = java;
      b.printSummary();
      b = c;
      b.printSummary();
    }
}
