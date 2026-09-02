import java.util.*;
public class recurse {
    public static void printNum(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n = sc.nextInt();
        printNum(n);
    }
}
