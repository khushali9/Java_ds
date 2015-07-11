import java.util.Scanner;

/**
 * Created by khushali on 4/7/15.
 */
  //Applications of stack:
  //      Balancing of symbols:
    //    Infix to Postfix/Prefix conversion
      //  Redo-undo features at many places like editors, photoshop.
        //Forward and backward feature in web browsers
        //Used in many algorithms like Tower of Hanoi, tree traversals, stock span problem, histogram problem.
        //Other applications can be Backtracking, Knight tour problem, rat in a maze, N queen problem and sudoku solver

        //Pros: Easy to implement. Memory is saved as pointers are not involved.
        //Cons: It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.
        //Linkedlist
        //Pros: The linked list implementation of stack can grow and shrink according to the needs at runtime.
        //Cons: Requires extra memory due to involvement of pointers.
public class _06_stack {

 private int top;

   private int maxsize;
    private char[] mystack; // make all of this private and array main define in constuctor

    public _06_stack(int size) //constructor
    {
        this.maxsize=size;
        mystack=new char[maxsize];
        top=-1;

    }
    public boolean isEmpty(){
        if (top==-1)

            return true;

        else
            return false;

    }

    public boolean isFull(){
        if (top==(maxsize-1))

            return true;

        else
            return false;
    }
   public void push(char item) //char as to use for revers the word example use
    {
        if (this.isFull())
        {
            System.out.println("The stack is full");

        }
        else
        {
            mystack[++top] = item;
        }
    }

    public char pop(){
        if (this.isFull())
        {
            System.out.println("The stack is empty");
            return 0;

        }
        else
        {
            return mystack[top--];
        }

    }


    public void Display(){
        while(top>=0)
        {
            System.out.println(mystack[top]);
            if(top!=0) {
                top--;
            }
            if(top==0)
            {
                return;
            }
        }
    }

    public static void main(String args[])
    {
        _06_stack stack1 = new _06_stack(3);

        stack1.push('i');
        stack1.Display();
        stack1.push('k');
        stack1.push('l');
        stack1.pop();

    }

}
