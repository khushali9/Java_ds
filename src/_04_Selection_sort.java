import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by khushali on 3/27/15.
 */
public class _04_Selection_sort {
    //compare all element find lowest
    //and put it first
    //now start the same from secon till last n keep on doing the same

    public static void main(String[] args)throws IOException {
        int maxsize;
        System.out.println("Please input an size of the array");
        String get_size=getString();
        maxsize=Integer.parseInt(get_size); // this can also be done with in.nextInt n scanner// parseInt rem
        int arr[]=new int[maxsize];
        setValue(arr,maxsize);
        selection_sort(arr, maxsize);



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

    public static void selection_sort(int arr[],int maxs) {
        for (int i = 0; i < maxs; i++)
        {
            int change=0;
            int temp=i;
            int min=arr[i];
            for (int j = i+1; j < maxs; j++)
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

        for(int i=0;i<maxs;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
