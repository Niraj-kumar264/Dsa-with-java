import java.util.*;
public class twodArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("enter the number of coloumns");
        int coloumns = sc.nextInt();
        int numbers[][] = new int[rows][coloumns];
        //input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<coloumns; j++) {
                
                System.out.println("enter the elements of the matrix");
            numbers[i][j] = sc.nextInt();
            }
         } // output
         
               for(int i=0; i<rows; i++) {
                for(int j=0; j<coloumns; j++) {
                    System.out.print(numbers[i][j] +" ");

                
               }
               System.out.println();
            }
            // find elements
            System.out.println("enter the elemets to search the location");
            int x = sc.nextInt();
               for(int i=0; i<rows; i++) {
                for(int j=0; j<coloumns; j++) {
                    if (numbers[i][j] == x) {
                        System.out.println("x is located at (" +i + "," +j +")");
                    }
        }
    }
    
    }
}