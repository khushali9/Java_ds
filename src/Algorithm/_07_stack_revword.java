package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by khushali on 4/7/15.
 */
public class _07_stack_revword {
    public static void main(String args[]) throws IOException{

        System.out.println("Enter the word you want to reverse");

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String word=br.readLine();
        int word_size=word.length();

      //  char ch[];




Stack st = new Stack();



        for(int i=0;i<word_size;i++) {
            System.out.println(word.charAt(i));
          st.push(word.charAt(i));
        }



        for(int i=0;i<word_size;i++)
        {

            System.out.print(st.pop());
            // other logic while stack not empty do pop and store it into String with +=
        }
    }


}
