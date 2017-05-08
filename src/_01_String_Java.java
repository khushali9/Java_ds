import java.io.*;
import java.util.*;
/**
 * Created by khushali on 12/27/15.
 */
public class _01_String_Java {

//Accepted
    //my mistakes string mathods on Char, take care of lexico if and is + then A is bigger


        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();


            //code for length
            int m=A.length()+B.length();
            System.out.println(m);

            //code for lexicograph
            if (A.compareTo(B)>0)
                System.out.println("Yes");
            else
                System.out.println("No");

            String a=A.substring(0,1).toUpperCase().concat(A.substring(1,A.length()));
            String b=B.substring(0, 1).toUpperCase().concat(B.substring(1, B.length()));

            System.out.println(a+" "+b);

        }
    }

