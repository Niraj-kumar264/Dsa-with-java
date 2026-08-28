import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    //check for odd and even
    System.out.println("enter a number to check whether the number is even or odd");
    int n1 = sc.nextInt();
    if (n1%2 == 0) {
        System.out.println("the number is even");
        
    } else {
        System.out.println("the number is odd");
        
    }
   // number check 
   System.out.println("enter the first number");
   int n2 = sc.nextInt();
   System.out.println("enter the second number");
   int n3 = sc.nextInt();
   
   if (n2 == n3) {
    System.out.println("both given number are equal");
    
   } else if(n2 > n3) {
    System.out.println("the first number is greater");
    
   }
   else {
    System.out.println("the second number is greater");
   }


    }
    
}
