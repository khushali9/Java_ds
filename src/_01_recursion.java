import java.io.IOException;
import java.util.Scanner;

/**
 * Created by khushali on 10/6/15.
 */
public class _01_recursion {

    public int triangle(int n){
        if(n==1)
        return 1;
        else
            return (n+triangle(n-1));

    }

    public static void main(String args[]) throws IOException{
        System.out.print("\n Enter number to calculate the sum");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        _01_recursion rec=new _01_recursion();
        System.out.print("Answers:"+rec.triangle(num));


    }

}
