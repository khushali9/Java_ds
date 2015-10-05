import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;



/**
 * Created by khushali on 4/7/15.
 */
public class _08_stack_delimiter {
    public static void main(String args[]) throws IOException {

        System.out.println("Enter String you want to find error");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String word = br.readLine();
        int word_size = word.length();

        Stack st=new Stack();


        for(int i=0;i<word_size;i++) {
            char ch=word.charAt(i);
            switch(ch)
            {
                case '{':
                case '(':
                case '[':
                    st.push(ch);
                    break;
                case '}':
                case ')':
                case ']':
                    if(!st.isEmpty())
                    {
                        char ch1= st.pop().toString().charAt(0); // convert obj --> Char
                        if((ch=='}'&&ch1!='{') ||(ch==']'&&ch1!='[')||(ch==')'&&ch1!='(')) //put all or in one ()
                          //  System.out.println(ch1);
                            System.out.println("Error Found");
                    }
                    else
                    {
                        //System.out.println("Error Found");
                    }
                    break;
                default:
                    break;// do nothing for other characters
            }// end of switch
        } // end of for


        //now all char processed from the word so if something in stack it is error
        if(!st.isEmpty())
        {
                System.out.println("Right parentheses mismatch error ");
        }



    }



}

