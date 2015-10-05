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
Adaptive: O(n) when nearly sorted
    here u start from left n compare two with each other if left is big swap
    n after first step u compare N-1 n the last element is sorted n at its proper place
    n keep on doing still all the elements are sorted

Bubble sort has many of the same properties as insertion sort,
 but has slightly higher overhead. In the case of nearly sorted data,
 bubble sort takes O(n) time, but requires at least 2 passes through the data
  (whereas insertion sort requires something more like 1 pass).

 → invariant: a[1..i] in final position

*/
public class _03_bubble_sort {


    public static void main(String[] args)throws IOException {
        int maxsize;
        System.out.println("Please input an size of the array");
        String get_size=getString();
        maxsize=Integer.parseInt(get_size); // this can also be done with in.nextInt n scanner// parseInt rem
        int arr[]=new int[maxsize];
        setValue(arr,maxsize);
        bubble_sort(arr);



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

    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;

    }

    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < (arr.length - 1); j++) //i<max-1 cause if Max then i+1 goes out of bound
            {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
