import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
public class arrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);
        System.out.println(list);
        //get elements
        int element = list.get(2);
        System.out.println(element);

        //add elements in between an arraylist
        list.add(2, 9); 
        System.out.println(list);

        //set elements or change  the value of element
        list.set(0, 2);
        System.out.println(list);

        //delete an element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loop
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //shorting
      Collections.sort(list);
      System.out.println(list);
      Collections.reverse(list);
      System.out.println(list);
    }
}