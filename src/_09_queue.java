import java.util.Stack;

/**
 * Created by khushali on 4/7/15.
 */
public class _09_queue {
    /*
    //Operations to implement insert,remove,peek,isempty , is full
    //first in first out
    //use keywords rear,front,maxSize,nItems
    //remember to insert as rear and remove from front
    Stack : Adv :Provides last-in, first-out access.
   Queue: Adv:  Provides first-in, first-out access.

    Stack : dis Adv :Slow access to other items.
    Queue: disAdv: Slow access to other items.

    boolean isNotEmpty() {
      return (queuerear > queueFront);
   }

*/
    private int cap, cur,front,rear;
    private int[] Q;

    public _09_queue(int cap){
        this.cap=cap;
        Q=new int[cap];
        rear=-1;
        front=0;
        cur=0; //number of Items in the Queue array
    }

    public boolean isEmpty()
    {
        //return ( rear+1==front || (front+maxSize-1==rear) );
        return cur == 0;
    }


    public boolean isFull()
    {
        //return ( rear+2==front || (front+maxSize-2==rear) );
        return cur == cap;
    }

    //Puts a value into the back of the queue.
    //instead of Exception you can write code to double
    // the size by taking new aaray n copying this one in it

    public void insert(int i){
        if(rear==cap-1) rear=-1;
        Q[++rear]=i;
        cur++;
    }

    public int remove(){
        int tmp=Q[front++];
        if(front==cap) front=0;
        cur--;
        return tmp;
    }

    public int peekFront(){
        return Q[front];
    }



    public void enqueue (int value)
    {
        if (isFull())  throw new QueueException("Queue is Full");

        rear++;
        Q[rear%cap] = value; //can have rear only. this is to make it work with rap around
        cur++;
    }
    public int getFront()
    {
        if (isEmpty())
            throw new QueueException();
        else
            return Q[front%cap];
    }

    //Returns and removes the front element of the queue.

    public int dequeue()
    {
        int e = getFront();
        Q[front%cap] = 0; // for garbage collection
        front++;
        cur--;
        return e;
    }
    class QueueException extends RuntimeException {
        public QueueException(String name) {
            super(name);
        }

        public QueueException() {
            super();
        }
    }

}

//queue out of Stack
class queueOfStack{
Stack s1,s2;
    public queueOfStack(){
        s1=new Stack();
        s2=new Stack();
    }

    public void enqueue(int val){
        s1.push(val);
    }
    public int pop(){
        if(!s2.isEmpty()) return Integer.parseInt(s2.pop().toString());
        while(!s1.isEmpty()) s2.push(s1.pop());
        return Integer.parseInt(s2.pop().toString());

    }



}


