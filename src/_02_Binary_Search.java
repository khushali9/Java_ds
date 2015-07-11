import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by khushali on 3/27/15.
 */

//data must be sorted
public class _02_Binary_Search {

    public static void main(String[] args)throws IOException{
        int maxsize;
        System.out.println("Please input an size of the array");
        String get_size=getString();
        maxsize=Integer.parseInt(get_size); // this can also be done with in.nextInt n scanner// parseInt rem
        int arr[]=new int[maxsize];
        setValue(arr,maxsize);
        System.out.println("Please input the value to be found");
        Scanner in=new Scanner(System.in);
        int val=in.nextInt();
        boolean result=binary_Search(arr,maxsize,val);
        System.out.println(result);


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

    public static boolean binary_Search(int arr[],int maxs, int val)
    {
        boolean flag=false;
        int max=maxs;
        int low=0;
        int high=maxs;
        if (max%2==0) //find mid val
        {
         max=max/2;
        }
        else
        {
            max=(max+1)/2;
        }

        for(int i=low;i<high;i++)
        {
            if(val==arr[i])
            {
                flag=true;
                System.out.println("found at element position "+(i+1)); //i+1 will append i just here
                break;
            }
            else if(val<arr[i])
            {
                high=max-1;
                max=high/2;
            }
            else
            {
                low=max+1;
                max=low/2;
            }




        }


        return flag;



    }




}
