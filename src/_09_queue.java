/**
 * Created by khushali on 4/7/15.
 */
public class _09_queue {
    //Operations to implement insert,remove,peek,isempty , is full
    //first in first out
    //use keywords rear,front,maxSize,nItems
    public static void main(String[] args)
    {
        queue que=new queue(5);
        que.insert(9);
        que.insert(10);
        que.remove();
        que.remove();


    }
}
class queue{

    private int maxSize,front,rear;
    private int[] Arr;
    private int nItems;

    queue(int maxSize)
    {
        this.maxSize=maxSize;
        Arr=new int[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public void insert(int val)
    {
        if(rear<maxSize-1) {
            rear++;
            Arr[rear] = val;
            nItems++;
        }
        else
        {
            System.out.println("Overflaw");
        }
    }

    public void remove(){
        int temp=Arr[front++];
        if(front==maxSize) {
            front = 0;
        }
            nItems--;
        System.out.println(temp);

    }

    public boolean isEmpty() // true if queue is empty {
    {return (nItems==0);
    }

    public boolean isFull() // true if queue is full {
    {
    return (nItems==maxSize);
    }
}