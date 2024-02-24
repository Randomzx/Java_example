
import java.util.*;

public class Test {

    private static Map<String, Integer> map;

    public Test() {
        map = new HashMap<>();
        map.put("foo", 1);
        map.put("bar", 3);
    }

    public static int getValue(String input, int numRetries) throws Exception {
        try {
            return map.get(input);
        }
        catch (Exception e) {
            if (numRetries > 3) {
                throw e;
            }
            return getValue(input, numRetries + 1);
        }
    }

    public static void main(String[] args)
    {

        try {
            int num = getValue("foo", 0);
            int nn = num;
            System.out.println(getValue("foo", 0));
        }catch (Exception e) {

        }
    }


}