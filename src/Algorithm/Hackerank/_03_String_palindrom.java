package Algorithm.Hackerank;

/**
 * Created by khushali on 12/27/15.
 */

import java.io.*;
import java.util.*;
public class _03_String_palindrom {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String rev="";

        for(int i=(A.length()-1);i>=0;i--)
        {
            rev +=A.charAt(i);
        }
        if (A.equals(rev)){
            System.out.print("Yes");
        }
        else
            System.out.print("No");

    }
}
