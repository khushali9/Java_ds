/**
 * Created by khushali on 3/25/15.
 */

import java.io.*;

public class _01_hello_world {

    /* Array
    Advantage : Quick insertion, very fast access if index known.
    Disadvantages: Slow search, slow deletion, fixed size.

    Ordered array
    Adv: Quicker search than unsorted array.
    Dis: Slow insertion and deletion, fixed size.

    First of all, length is a property,
    so it would be arr.length instead of arr.length().

    And it will return 10, the declared size.
    The elements that you do not declare explicitely
    are initialized with 0.

    Class Array
    public class Arrays extends Object
    java.util.Arrays

    This class contains various methods for manipulating arrays (such as sorting and searching).
     This class also contains a static factory that allows arrays to be viewed as lists.
    The methods in this class all throw a NullPointerException, if the specified array reference is null,
    except where noted.
     */

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!!");
        int intArray[] = new int[100];

        String s = getString();
        System.out.println(s);

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
