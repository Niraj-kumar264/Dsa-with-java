import java.util.*;
public class arry {
  public static void main(String[] args) {
    int sum = 0;
    double perct;
    int[] marks = new int[5];
    System.out.println("enter the marks of english");
    Scanner sc = new Scanner(System.in);
     marks[0] = sc.nextInt();
     System.out.println("enter the marks of hindi");
     marks[1] = sc.nextInt();
     System.out.println("enter the marks of science");
     marks[2] = sc.nextInt();
     System.out.println("enter the marks of maths");
     marks[3] = sc.nextInt();
     System.out.println("enter the marks of social science");
     marks[4] = sc.nextInt();
     
     for(int i = 0; i < marks.length; i++) {
      sum = sum + marks[i];

     }
    System.out.println("total marks =" + sum);
    perct = sum/5;
    System.out.println("percantage =" +perct);

  }  
}
