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