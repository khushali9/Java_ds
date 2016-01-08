import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by khushali on 10/6/15.
 */
public class _10_Stack_List {
private static class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }

    public Node(int data,Node n){
        this.data=data;
        this.next=n;
    }

}
    private Node top;

    //Constructor
    public _10_Stack_List(){
        top=null;
    }

    public boolean isEmpty( )
    {
        return top == null;
    }


    public void clear( )
    {
        top = null;
    }

    public void push(int data)
    {
        top = new Node(data, top);
        // basically we are adding it in front ;)
    }

    public int pop( )
    {
        if(isEmpty( )) throw new StackException("Stack is empty");
        int data = top.data;
        top = top.next;
        return data;
    }
    public int peek( )
    {
        if(isEmpty( ))  throw new StackException("Stack is empty");
        return top.data;
    }



    //Stack with Min Here s2 is yet another Stack
    Stack s2=new Stack();
    public void pushMin(int val){
        if(val<=min()){
            s2.push(val);
        }
        //here goes s.push(value) for main
    }

    public int popMin(){
        //main.pop() -> Value
        //if value ==min -> s2.pop()
        return 0; //value
    }

    public int min(){
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;

        }else
        {
         return Integer.parseInt(s2.peek().toString());
        }
    }

    //sort Stack
    public void sortStack(Stack s){
        Stack r =new Stack();
        while(!s.isEmpty()){
            int tmp=Integer.parseInt(s.pop().toString());
            while(!r.isEmpty() && Integer.parseInt(r.peek().toString())>tmp){
                s.push(r.pop());
            }
            r.push(tmp);
        }
        //Ans is in r
    }



}

//one for bunch of stakc if one get filled m,ake ne w stack kind.
class setOfStack{
    ArrayList<Stack> stack=new ArrayList<Stack>();
    int capacity;
    public setOfStack(int capacity){this.capacity=capacity;}
    public Stack getLastStack(){
        if(stack.isEmpty()) return null;
        return stack.get(stack.size()-1); //return the last Stack this way from array list;
    }
    public void push(int v){
        Stack last=getLastStack();
        //Now chack if last stack is either null or full
        if(last!=null && last.size()!=last.capacity()){
            last.push(v);
        }
        else{
            //now we make new stack and also add that into th earrya list
            Stack st2=new Stack();
            st2.push(v);
            stack.add(st2);

        }

    }
    public int pop(){
    Stack last=getLastStack();
        int v=Integer.parseInt(last.pop().toString());
        if(last.size()==0)stack.remove(stack.size()-1); //if last stack gets to the 0th element means emapty
        return v;

    }
}

class StackException extends RuntimeException
{
    public StackException(String name)
    {
        super(name);
    }

    public StackException()
    {
        super();
    }
}