package Algorithm.Hackerank;

/**
 * Created by khushali on 12/27/15.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class _02_String_Sub_lex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        int m=Integer.parseInt(sc.next());

        String min=first.substring(0,m);
        String max=first.substring(0,m);

        for(int i=1;i+m<=(first.length());i++){
            if(min.compareTo(first.substring(i,i+m))>0){
                min=first.substring(i,i+m);
            }
            if(max.compareTo(first.substring(i,i+m))<0){
                max=first.substring(i,i+m);
            }
        }


        System.out.println(min);
        System.out.println(max);


    }
}
