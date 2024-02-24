import java.util.ArrayList;
import java.util.ListIterator;



    public class AccessArrayListUsingListIterator {
        public static void main(String args[]) {

            // use a ListIterator to loop through all the values of ArrayList
            ArrayList<String> myArrList = new ArrayList<String>();
            myArrList.add("One");
            myArrList.add("Two");
            myArrList.add("Four");
            myArrList.add(2, "Three");
            ListIterator<String> iterator = myArrList.listIterator();
            System.out.println("Values of ArrayList: ");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println(" ");



            // All elements of ArrayList yourArrList are inserted into ArrayList myArrList
            ArrayList<String> myArrList2 = new ArrayList<String>();
            myArrList2.add("One");
            myArrList2.add("Two");
            ArrayList<String> yourArrList = new ArrayList<String>();
            yourArrList.add("Three");
            yourArrList.add("Four");
            myArrList2.addAll(1, yourArrList);
            System.out.println("yourArrList inserted into myArrList: ");
            for (String val : myArrList2) {
                System.out.println(val);
            }
            System.out.println(" ");



            // Clone Copy the element reference to another arraylist
            ArrayList<StringBuilder> myArrList3 = new ArrayList<StringBuilder>();
            StringBuilder sb1 = new StringBuilder("Jan");
            StringBuilder sb2 = new StringBuilder("Feb");
            myArrList3.add(sb1);
            myArrList3.add(sb2);
            myArrList3.add(sb2);

            // Assigns object referred to by myArrList to assignedArrList
            ArrayList<StringBuilder> assignedArrList = myArrList3;

            // Clones myArrList and assigns it to clonedArrList
            ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>)myArrList3.clone();
            // true, because myArrList and assignedArrList refer to the same object.
            System.out.println(myArrList3 == assignedArrList);
            // false,  because myArrList and clonedArrList refer to separate objects,
            //because the method clone creates and returns a new object of ArrayList
            System.out.println(myArrList3 == clonedArrList);

            // proves that the method clone didn’t copy the elements of myArrList.
            // All the variable references myArrVal, AssignedArrVal, and clonedArrVal refer to the same objects
            StringBuilder myArrVal = myArrList3.get(0);
            StringBuilder assignedArrVal = assignedArrList.get(0);
            StringBuilder clonedArrVal = clonedArrList.get(0);

            // print true
            System.out.println(myArrVal == assignedArrVal);
            // print true
            System.out.println(myArrVal == clonedArrVal);

        }
    }


