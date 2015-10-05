import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by khushali on 3/27/15.
 */
/*
Not stable
O(1) extra space
Θ(n2) comparisons
Θ(n) swaps
Not adaptive

compare all element find lowest
    and put it first
    now start the same from secon till last n keep on doing the same

    From the comparions presented here, one might conclude
     that selection sort should never be used.
    It does not adapt to the data in any way
    (notice that the four animations above run in lock step),
     so its runtime is always quadratic.

However, selection sort has the property of minimizing the number of swaps.
In applications where the cost of swapping items is high,
selection sort very well may be the algorithm of choice.

→ invariant: a[k] smallest of a[i..n]
    swap a[i,k]
    → invariant: a[1..i] in final position


 */
public class _04_Selection_sort {

    public static void main(String[] args)throws IOException {
        Scanner in=new Scanner(System.in);
        int maxsize=in.nextInt();
        System.out.println("Please input an size of the array");

        int arr[]=new int[maxsize];
        setValue(arr,maxsize);
        selection_sort(arr);



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


    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++)
        {
            int change=0;
            int temp=i;
            int min=arr[i];
            for (int j = i+1; j < arr.length; j++)
            {
               if(min>arr[j])
               {
                   min=arr[j];
                   temp=j; //to know the index of the lowest so that we know which elemnt to swap
                   change=1;
               }

            }
            if (change==1)
            
            {arr[temp]=arr[i];
                arr[i]=min;
                change=0;
            }

        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
