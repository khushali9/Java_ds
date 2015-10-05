import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by khushali on 3/27/15.
 */
/*
Stable
O(1) extra space
O(n2) comparisons and swaps
Adaptive: O(n) time when nearly sorted
Very low overhead

here we compare 2 element in put low in left most then we
    compare 2 n 3rd element if 3rd low we keep in the place of 2nd
    now compare with 1st n 2nd again i 2nd is low put it at first

    Although it is one of the elementary sorting algorithms with O(n2)
     worst-case time, insertion sort is the algorithm of choice either
    when the data is nearly sorted (because it is adaptive) or
    when the problem size is small (because it has low overhead).

For these reasons, and because it is also stable,
insertion sort is often used as the recursive base case
(when the problem size is small)
for higher overhead divide-and-conquer sorting algorithms,
such as merge sort or quick sort.

→ invariant: a[1..i] is sorted

 */
public class _05_Insert_sort {


    public static void main(String[] args)throws IOException {
       Scanner in=new Scanner(System.in);
        int maxsize=in.nextInt();
        System.out.println("Please input an size of the array");
       // this can also be done with in.nextInt n scanner// parseInt rem
        int arr[]=new int[maxsize];
        setValue(arr,maxsize);
        insertion_sort(arr);



    }

    public static void setValue(int arr[],int max)
    {
        for (int i=0;i<max;i++)
        {
            System.out.println("Please Input an element");
            Scanner in=new Scanner(System.in);
            arr[i]=in.nextInt();
        }
    }



    public static void insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++)
        {
            int temp;

            for (int j = i;j>=1; j--) //condition is donw till true 
            {

                if(arr[j]<arr[j-1])
                {

                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;


                }

            }


        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
