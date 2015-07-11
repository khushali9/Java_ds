import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by khushali on 3/27/15.
 */
public class _03_bubble_sort {
    //here u start from left n compare two with each other if left is big swap
    //n after first step u compare N-1 n the last element is sorted n at its proper place
    //n keep on doing still all the elements are sorted
    //http://www.sorting-algorithms.com


    public static void main(String[] args)throws IOException {
        int maxsize;
        System.out.println("Please input an size of the array");
        String get_size=getString();
        maxsize=Integer.parseInt(get_size); // this can also be done with in.nextInt n scanner// parseInt rem
        int arr[]=new int[maxsize];
        setValue(arr,maxsize);
        bubble_sort(arr,maxsize);



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

    public static void bubble_sort(int arr[],int maxs) {
        for (int j = 0; j < maxs; j++)
        {
            for (int i = 0; i < maxs - 1; i++) //i<max-1 cause if Max then i+1 goes out of bound
            {
                if (arr[i] > arr[i + 1]) {
                    int temp;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<maxs;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
