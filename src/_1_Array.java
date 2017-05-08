import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by khushali on 3/11/16.
 */
public class _1_Array {
    /* Array Why, Theory, Big-O, Applications
    Advantage : Quick insertion, very fast access if index known.
    Disadvantages: Slow search, slow deletion, fixed size.

    Ordered array
    Adv: Quicker search than unsorted array.
    Dis: Slow insertion and deletion, fixed size.

    First of all, length is a property,
    so it would be arr.length instead of arr.length().

    And it will return 10, the declared size. The elements that you do not declare explicitly
    are initialized with 0.

    Class Array
    public class Arrays extends Object
    java.util.Arrays

    This class contains various methods for manipulating arrays (such as sorting and searching).
     This class also contains a static factory that allows arrays to be viewed as lists.
    The methods in this class all throw a NullPointerException, if the specified array reference is null,
    except where noted.

    http://bigocheatsheet.com/
    Time Complexity
    Access O(1) for Avg & Worst
    Search,Insertion,Deletion  O(n) for Avg & Worst

    Hash Tables

    ArrayList
    An ArrayList, or a dynamically resizing array, is an array that resizes itself as needed while
    still providing O(1) access. A typical implementation is that when a vector is full, the array
    doubles in size. Each doubling takes O(n) time, but happens so rarely that its amortized time
    is still O(1).


     */

    public static void main(String[] args) throws IOException {
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
