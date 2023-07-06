package p4;

public class FB {
    {
        System.out.println("Saint Morelas");
    }
    
    public String name;
    public String clan;
    public double score;
    public float intensity;
    
    
    public FB(){
        System.out.println("Wingardium Leviosa");
    }
    
    public FB(String name,String clan){
    this.name=name;
    this.clan=clan;
    }
    
    public FB(double score){
     this("Sadia","Hasan");
     this.score=score;
    }
    
    public FB(float intensity){
    this("Helena","Parvin");
    this.intensity=intensity;
    }
    
    public void printFullName(){
        System.out.println(name+" "+clan);     
    }
 
    public void printDetails(){
     printFullName();
        System.out.println("Score: "+score);
         System.out.println("Intesity: "+score);
    }
    
    {
        System.out.println("Xefer Toleus");    
    }
}
