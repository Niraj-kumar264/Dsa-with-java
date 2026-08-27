
import java.util.*;
public class facto {
    public static void main(String[] args) {
        double n;
       double fact = 1;
       double a;
       double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextDouble();
        for(int i = 1; i<=n; i++) {
             
             fact = fact * i;
        }
        System.out.println("factorial of the number is :"+fact);
// calculate power
System.out.println("calculate number with power");
System.out.println("enter the base number");
a = sc.nextDouble();
System.out.println("enter the power of the number");
b = sc.nextDouble();
double result = Math.pow(a, b);
System.out.println(a +"power"+ b +"=" + result);

    }
}
