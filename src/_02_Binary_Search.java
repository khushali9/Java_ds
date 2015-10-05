import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by khushali on 3/27/15.
 */
/*

Complexity
Since each comparison binary search uses halves the search space,
we can assert and easily prove that binary search will never use more than (in big-oh notation)
O(log N) comparisons to find the target value.
The logarithm is an awfully slowly growing function.
 In case you’re not aware of just how efficient binary search is,
 consider looking up a name in a phone book containing a million names.
 Binary search lets you systematically find any given name using at most 21 comparisons.
 If you could manage a list containing all the people in the world sorted by name,
  you could find any person in less than 35 steps.
   This may not seem feasible or useful at the moment, but we’ll soon fix that.

Note that this assumes that we have random access to the sequence.
Trying to use binary search on a container such as a linked list makes little sense and
it is better use a plain linear search instead.

Java has a built-in Arrays.binary_search



some little to remember
int=Integer.parseInt(String);

 */
    // Binary Search : data must be sorted


public class _02_Binary_Search {

    public static void main(String[] args)throws IOException{
        Scanner in=new Scanner(System.in);
        int maxsize=in.nextInt();
        System.out.println("Please input an size of the array");

        int arr[]=new int[maxsize];
        setValue(arr);
        System.out.println("Please input the value to be found");
        in=new Scanner(System.in);
        int val=in.nextInt();
        int result=binary_Search(arr,val);
        System.out.println(result);


    }

    public static void setValue(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Please Input an element");
            Scanner in=new Scanner(System.in);
            arr[i]=in.nextInt();
        }
    }



    public static int binary_Search(int arr[], int val) {

        int mid;
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            mid =   low + (high - low) / 2;
            if (arr[mid] == val)
                return mid;
            else if (arr[mid] < val)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return 9;

    }





}
