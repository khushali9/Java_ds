import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by khushali on 4/7/15.
 */
public class _13_Infixpostfix {

  //  1.	Print operands as they arrive.

    //2.	If the stack is empty or contains a left parenthesis on top, push the incoming operator onto the stack.

      //      3.	If the incoming symbol is a left parenthesis, push it on the stack.

//            4.	If the incoming symbol is a right parenthesis, pop the stack and print the operators until you see a left parenthesis. Discard the pair of parentheses.

  //  5.	If the incoming symbol has higher precedence than the top of the stack, push it on the stack.

    //6.	If the incoming symbol has equal precedence with the top of the stack, use association. If the association is left to right, pop and print the top of the stack and then push the incoming operator. If the association is right to left, push the incoming operator.

      //      7.	If the incoming symbol has lower precedence than the symbol on the top of the stack, pop the stack and print the top operator. Then test the incoming operator against the new top of stack.

    //8.	At the end of the expression, pop and print all operators on the stack. (No parentheses should remain.)

    static int prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
     public static void main(String args[]) throws IOException{

         System.out.println("Enter the word you want to reverse");

         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         String word = br.readLine();
         String output="";
         int word_size = word.length();

         Stack st=new Stack();
         for(int i=0;i<word_size;i++) {
             char ch=word.charAt(i);
             switch(ch){ //open switch
                 case '(':
                     st.push(ch);
                     break;
                 case ')':
                     while(!st.isEmpty()){
                         if(!(st.peek().toString().equals('('))) {
                             output += st.pop().toString();
                         }
                         else
                         {
                             st.pop();
                             break;
                         }
                     }
                     break;
                 //while
                 case'+':
                 case'-':
                     if(st.isEmpty()){
                         st.push(ch);
                     }
                              else {
                                  //while (!st.isEmpty())
                                  {
                                      /**if ((st.peek().toString().equals('('))) {
                                       st.push(ch);
                                       }
                                       if (prec(st.peek().toString().charAt(0)) < prec(ch)) {
                                       st.push(ch);
                                       }*/

                                      if(prec(st.peek().toString().charAt(0))>=prec(ch)){
                                      //if (st.peek().toString().equals('*') || st.peek().toString().equals('/')||st.peek().toString().equals('+')) {
                                         System.out.println("hu"+ch+st.peek());
                                          output += st.pop().toString();
                                          //st.pop();
                                      } else {
                                          break;
                                      }

                                  }
                      }
                     st.push(ch);
                     break;
                 case'*':
                 case'/':
                     if(st.isEmpty()){
                         st.push(ch);
                     }
                     else {
                         //while (!st.isEmpty())
                         {
                             /**if ((st.peek().toString().equals('('))) {
                                 st.push(ch);
                             }*/

                             if (prec(st.peek().toString().charAt(0))>=prec(ch)) {
                                 System.out.println("hi");
                                 output += st.pop().toString();
                                 st.pop();
                             }
                             if (prec(st.peek().toString().charAt(0)) < prec(ch)) {
                                 System.out.println("hu");
                                 st.push(ch);
                             }
                             else {
                                 break;
                             }

                         }
                     }
                     st.push(ch);
                     break;

                 default:
                     //System.out.println(ch);
                     output+=ch;
                    // st.push(ch);
                     break;




             }//close switch

         }
         if (!st.isEmpty()){
             output += st.pop().toString();
         }
         System.out.println(output);

     }
}
