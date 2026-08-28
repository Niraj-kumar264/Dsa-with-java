import java.util.* ;
public class loop { 
    public static void main(String[] args) {
        /*for(int i = 0; i<=100; i++) {
            System.out.println(i);
        }
       Scanner sc = new Scanner(System.in);
       int base;
       int power;
       System.out.println("enter the base number");
       base = sc.nextInt();
       System.out.println("enter the power");
       power = sc.nextInt();
       int p = 1;
       for(int i = 1; i<=power; i++) {
        p = p*base;
        System.out.println(p);

       }
      int i = 0;
      while (i <11) {
        System.out.println(i);
        i++;
        
      }
     int i = 0;
     do {
        System.out.println(i);
        i++ ; 
    }
        while (i <11);*/
        int num;
         int sum = 0;
         int avg = 0;

        System.out.println("enter the number whose sum of first n number you want");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i = 1; i<=num ; i++) {

            sum =sum+i;
        

        }
        avg = sum/num;
        System.out.println("the sum of the number is :" +sum);
        System.out.println("the average of sum of the number is :" +avg);
         

     }

      

    }
    

