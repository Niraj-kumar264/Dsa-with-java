import java.util.*;
public class sumnRecuse { 
    public static void printSum(int i, int n, int sum) {
        if (i ==n) {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        System.out.println("enter the last number ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printSum(1, n, 0);
    }
}
