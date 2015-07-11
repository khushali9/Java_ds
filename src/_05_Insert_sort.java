import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by khushali on 3/27/15.
 */
public class _05_Insert_sort {
    //here we compare 2 element in put low in left most then we
    //compare 2 n 3rd element if 3rd low we keep in the place of 2nd
    //now compare with 1st n 2nd again i 2nd is low put it at first

    public static void main(String[] args)throws IOException {
        int maxsize;
        System.out.println("Please input an size of the array");
        String get_size=getString();
        maxsize=Integer.parseInt(get_size); // this can also be done with in.nextInt n scanner// parseInt rem
        int arr[]=new int[maxsize];
        setValue(arr,maxsize);
        insertion_sort(arr, maxsize);



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

    public static void insertion_sort(int arr[],int maxs) {
        for (int i = 0; i < maxs; i++)
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

        for(int i=0;i<maxs;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
