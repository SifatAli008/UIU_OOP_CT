package p1;

public class Ebook extends Book
{
  public String format;  

    public Ebook() {
        super(0, 0);
    }


    public Ebook(int chapters, int pages,String format) {
        super(chapters, pages);
        this.format=format;
    }
    
     
    
    @Override
      public void printSummary(){
        System.out.println("Format : "+format);

    }
}
