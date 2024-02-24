import java.util.*;
public class Feb5 {

    public static void main(String[] args) {

        // this code won't compile
        /*
        String name = "Lion";
        int score = 100;
        if (name.equals("Lion"))
            score = 200;
            name = "Larry";         // This statement isn’t part of the if construct.
        else                        //The else statement seems to be defined without a preceding if construct
            score = 129;

         */

        int bill = 2000;
        // if (bill > 2000)
        // {
        //      discount = bill-150;
        // }else{
        //      bill - 100;
        // }
        int discount = (bill > 2000)? bill-150 : bill - 100;
        System.out.println(discount);


        /*
        int bill2 = 2000;
        int qty2 = 10;
        // won't compile qty2 condition needs to be a boolean value
        int discount2 = ++qty2 ? 10: 20;
         */


        /*
           if (bill2 > 1000) {
                if (qty > 11) {
                    discount2 = 10;
                }else{
                    if (days > 9) {
                        discount2 = 20;
                    }else{
                        discount2 = 30;
                    }
                }
           }else{
               discount2 = 5;
           }
         */
        int bill2 = 2000;
        int qty = 10;
        int days = 10;
        int discount2 = (bill2 > 1000)?
                            (qty > 11)?
                                10
                                : days > 9 ? 20 : 30
                            : 5;
        System.out.println(discount2);
    }
}
