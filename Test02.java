public class Test02 {
    public static void main(String[] args)
    {


        // stringbuilder
        //  default implementation of the method toString
        //  in the class Object returns the name of the class followed by the
        //  @ char and unsigned hexadecimal representation of the hash code of the object
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        sb1.append(new Person("Bob", "Hop"));
        System.out.println(sb1);

        // insert
        StringBuilder sb2 = new StringBuilder("123");
        char[] name = {'J', 'a', 'v', 'a'};
        sb2.insert(1, name, 1, 3);
        System.out.println(sb2);
        System.out.println(sb2);
        // replace
        StringBuilder sb3 = new StringBuilder("0123456");
        sb3.replace(2, 4, "ABCD");
        System.out.println(sb1.toString());

        // method chaining
        String result = "Monday ".replace(' ', 'Z').trim().concat("M n");
        System.out.println(result);

    }
}

class Person {
    String firstName;
    String lastName;
    Person(String str1, String str2) { firstName = str1; lastName = str2;}
}
