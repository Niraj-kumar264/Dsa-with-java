import java.util.*;
public class recurseFact {
    public static void printFactorial(int i, int n, int fact) {
        
        if(i==n) {
            fact= fact*i;
            System.out.println(fact);
            return;
        }
        fact= fact*i;
        printFactorial(i+1, n, fact);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("enter the lat number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printFactorial(1, n, 1);
        

    }

}
