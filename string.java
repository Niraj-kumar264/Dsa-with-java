import java.util.*; 
public class string {
    public static void main(String[] args) {
       String firstName;
       String lastName;
    String fullName;
Scanner sc = new Scanner(System.in) ; 
// concatination of strings
System.out.println("enter your first name");
 firstName = sc.next();
 System.out.println("enter your last name");
 lastName= sc.next();
fullName = firstName + " " + lastName;
System.out.println("your full name is " + fullName);
// length of string
System.out.println("length of yor full name is: " + fullName.length());
// charAt() method
for(int i=0; i<fullName.length(); i++) {
    System.out.println(fullName.charAt(i));
}
// compareTo( method)
System.out.println("comparing if first name and last name are equal or not");
if(firstName.compareTo(lastName) == 0) {
    System.out.println("first name and last name are equal");
} else {
    System.out.println("first name and last name are not equal");
}
   }

    
}
