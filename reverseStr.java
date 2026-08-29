import java.util.*;
public class reverseStr {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string you want to reverse"); 
      StringBuilder name = new StringBuilder(sc.nextLine());
      System.out.println("your given string is "+name);
      for (int i=0; i<name.length()/2; i++) {
        int front = i;
        int back = name.length() -1 -i;

        char frontChar = name.charAt(front);
        char backChar = name.charAt(back);

        name.setCharAt(front, backChar);
        name.setCharAt(back, frontChar);

      }
      System.out.println("reversed string is" +name);

    }
}
