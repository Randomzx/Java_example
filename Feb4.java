import java.util.*;
public class Feb4 {
    public static void main(String args[])
    {

        ArrayList<String> ejg = new ArrayList<>();
        ejg.add("One");
        ejg.add("Two");

        System.out.println(ejg.contains(new String("One"))); // // prints true

        System.out.println(ejg.indexOf("Two")); // prints 1

        ejg.clear(); // removes all elements of the list ejg

        System.out.println(ejg); // prints []

        //System.out.println(ejg.get(1)); // throws an exception



    }
}
