class StarPrint{
  int row;
  int col;


  StarPrint(int row,int col){
      this.row=row;
      this.col=col;
  }
  void patternPrint(){
    for(int i=0;i<row;i++){
        for(int j=0;j<i;j++){
        System.out.print(" * ");
    }
    System.out.println(" ");
    }
  }

}