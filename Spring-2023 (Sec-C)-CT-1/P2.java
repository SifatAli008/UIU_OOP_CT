import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int row = in.nextInt();
        int arr[][] = new int[row][];

        for(int i = 0; i < arr.length; i++){
          System.out.print("Enter number of Elment : ");
           int col = in.nextInt();
           arr[i] = new int[col];  
           for(int j = 0; j < col; j++){
            arr[i][j] = in.nextInt();
           }
        }

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(" ");
        }

        in.close();
    }
}
