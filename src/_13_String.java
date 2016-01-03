import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by khushali on 12/4/15.
 */
public class _13_String {

    public static String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev +=s.charAt(i);
        }
        return rev;
    }

    public static String reverseB(String s){
        StringBuilder rev=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

    public static String[] suffix(String s){

        int N=s.length();
        //For string builder StringBuilder S=new StringBuilder(s);
        String[] suff=new String[N]; //take care of []
        for(int i=0;i<N;i++) {
            suff[i] = s.substring(i, N);
            System.out.println(suff[i]);
        }
        return suff;

    }

    public static int prefix(String s, String comp){
      int N=Math.min(s.length(),comp.length());
            for(int i=0;i<N;i++){
                if(s.charAt(i)!=comp.charAt(i))
                {
                return i;
                }
            }

        return N;
    }

    public static Boolean uniqueChar(String s){
    // sort n then check.

        Boolean[] Char_set=new Boolean[256];
        for(int i=0;i<=s.length()-1;i++){
            int val=s.charAt(i);
            if(Char_set[val])return false;
            Char_set[val]=true;
        }
        return true;
    }

    public static void sortstr(String s){
        char[] chr=s.toCharArray();
        Arrays.sort(chr);
        String sorted=new String(chr);
        System.out.println("Sorted String : "+sorted);

    }

    //.equals to see if two strings are equal or not.

    //For anagrams see len if same go ahead, sort them, compare them if equal then anagram els not
    //Anagram another

    /*
    1) Create count arrays of size 256 for both strings. Initialize all values in count arrays as 0.
    2) Iterate through every character of both strings and increment the count of character in the corresponding count arrays.
    3) Compare count arrays. If both count arrays are same, then return true.
     */

    //String duplicate -> sort it and then check.

    /*Write a method to replace all spaces in a string with ‘%20’*/


    public static String replaceSpa(String str){
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                strBuffer.append("%20");
            }else {
                strBuffer.append(str.charAt(i));
            }
        }
        return strBuffer.toString();
    }




    public static void main(String Args[]) throws IOException {

        System.out.println("Enter the sentence you want to reverse");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();

        //rev string
        System.out.println("String Reverse: "+reverse(s));

        //rev with String Builder
        System.out.println("String Builder Reverse:"+reverseB(s));

        //Suffix
        suffix(s);

        //prefix
        System.out.println("Prefix:" + prefix(s,"khush"));

        //uniqueChar()
        //System.out.println("Unique Char:" + uniqueChar(s));

        //sort
        sortstr(s);



    }


}
