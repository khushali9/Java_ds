package Algorithm.Hackerank;

import java.util.Scanner;

/**
 * Created by khushali on 1/5/16.
 */
public class Hrank_live_contest {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        for(int j=0;j<i;j++){
            System.out.println(" ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int term=a;
            for(int k=0;k<n;k++){
              //  System.out.print(((2 ^ k) * b) + " ");
                term +=((Math.pow(2,k)) * b);// lerned Math.pow
                System.out.print(term+" ");
            }

        }
    }

}
