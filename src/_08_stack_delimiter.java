import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;



/**
 * Created by khushali on 4/7/15.
 */
public class _08_stack_delimiter {
    public static void main(String args[]) throws IOException {

        System.out.println("Enter the word you want to reverse");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String word = br.readLine();
        int word_size = word.length();

        Stack st=new Stack();

        //pushed string into Stack
        for(int i=0;i<word_size;i++) {
            System.out.println(word.charAt(i));
            st.push(word.charAt(i));
        }

        //Check for Correct or Wrong



    }



}

