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
    }
    public boolean isEmpty()
    {
        return cur == 0;
    }

    public boolean isFull()
    {
        return cur == cap;
    }

    //Puts a value into the back of the queue.
    //instead of Exception you can write code to double
    // the size by taking new aaray n copying this one in it

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

