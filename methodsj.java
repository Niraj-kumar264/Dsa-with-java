import java.util.*;
public class methodsj {
     public static void printMyName(String name) {
        System.out.println(name);
        return ;
    }
    public static int sum(int a, int b) {
        int sum = a+b;
        System.out.println("the sum of two numbers are:" +sum);
         return sum;

    }
    public static void fact(int n) {
        int fact = 1;
        for (int i=n; i>=1; i--) {
            fact = fact*i;
        }
        System.out.println("factorial of the number is:" +fact
        );
    }
    public static void main(String[] args) {
        
         System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b =  sc.nextInt();
        sum(a, b);
        System.out.println("enter a number to find the factorial of the number");
        int n = sc.nextInt();
        fact(n);
      
    }
    
}
