import java.util.NoSuchElementException;

/**
 * Created by khushali on 10/4/15.
 */
/* Java does not have stuct.
Struct is interface here.
Can a class be static in Java ?
The answer is YES, we can have static class in java.
In java, we have static instance variables as well
as static methods and also static block.
 Classes can also be made static in Java.

Java allows us to define a class within another class.
Such a class is called a nested class.
The class which enclosed nested class is known as Outer class.
In java, we can’t make Top level class static.
 Only nested classes can be static.

What are the differences between static and non-static nested classes?
1) Nested static class doesn’t need reference of Outer class,
but Non-static nested class or Inner class requires Outer class reference.

2) Inner class(or non-static nested class) can access both static and
 non-static members of Outer class.
 A static class cannot access non-static members of the Outer class.
 It can access only static members of Outer class.

3) An instance of Inner class cannot be created without an
instance of outer class and an Inner class can reference data and methods
defined in Outer class in which it nests,so we don’t need to pass
reference of an object to the constructor of the Inner class.
 For this reason Inner classes can make program simple and concise.



 */

public class _15_LinkList_My {


    private static class Node
    {
        int data;
        Node next;

        public Node(int data, Node next)
        {
            this.data=data;
            this.next=next;
        }



    };


    private Node head;
    public _15_LinkList_My(){
        head=null;
    }

    public boolean isEmpty(){
        return (head==null);
    }

    public void insertFirst(int data){

        // it is taken that is is already null
        head = new Node(data,head);
    }

    public int getFirst(){
        if (head==null) throw new NoSuchElementException();
        return head.data;
    }

    public int removeFirst(){
        int tmp=head.data;
        head=head.next;
        return tmp;
    }

    //Insert Last
    public void addLast(int data){
        if(head==null){
            head.data=data;
            head.next=null;
        }
        else
        {
            Node tmp=head;
            while(tmp.next!=null)
            {
                tmp=tmp.next;
            }
            tmp.next=new Node(data,null);

        }
    }

    //Get Last
    public int getLast(){
        if(head==null) throw new NoSuchElementException();
        else
        {
            Node tmp=head;
            while(tmp.next!=null)
            {
                tmp=tmp.next;
            }
            return tmp.data;

        }

    }

    //remove al node from the server
    public void clear(){
        head=null;
    }

    //check if our link list has particular value
    public boolean contains(int data){
        Node tmp=head;
        while(tmp.next!=null){
            if(tmp.data==data){
                return true;
            }
            else
            {
                continue;
            }

        }
        return false;
    }

    //insert after value
    public void insertAfterValue(int data, int data1){
        Node tmp=head;
        while(tmp!=null && !(tmp.data==data)){
            tmp=tmp.next;
        }
        if(tmp!=null){
            tmp.next=new Node(data1,tmp.next);

        }
    }

    //insert before value
    public void insertBeforeValue(int data,int data1){
        if(head==null) return;

        if(head.data==data){
            insertFirst(data1);
        }

        Node prev=null;
        Node cur=head;

        while(cur!=null && !(cur.data==data)){
            prev=cur;
            cur=cur.next;
        }

        //insert between cur and pre
        if(cur!=null) prev.next=new Node(data1,cur);



    }

    // remove the perticular data

    public void remove(int data){
        if (head==null) throw new RuntimeException("Cannnot Delete");

        if(head.data==data){
            head=head.next;
            return;
        }

        Node cur=head;
        Node prev=null;

        while(cur!=null && !(cur.data==data)){
            prev=cur;
            cur=cur.next;
        }
        if(cur!=null) throw new RuntimeException("cannot delete");

        prev.next=cur.next;



    }

    //Copy O(n^2)

    public _15_LinkList_My copy1(){
        _15_LinkList_My copy=new _15_LinkList_My();
        Node tmp=head;
        while(tmp!=null){
            copy.addLast(tmp.data);
            tmp=tmp.next;
        }
        return copy;
    }

    public _15_LinkList_My reverse(){
        _15_LinkList_My list= new _15_LinkList_My();
        Node tmp=head;

        while(tmp!=null){
            list.insertFirst(tmp.data);
            tmp=tmp.next;
        }
        return list;
    }

    //copy O(n)
    public _15_LinkList_My copy2(){
        _15_LinkList_My copy2=new _15_LinkList_My();
        Node tmp=head;
        while(tmp!=null){
            copy2.insertFirst(tmp.data);
            tmp=tmp.next;
        }
        return copy2.reverse();
    }

    //copy O(n) but tail
    public _15_LinkList_My copy3(){
        _15_LinkList_My copy3=new _15_LinkList_My();
        Node tmp=head;
        if(head==null) return null;
        copy3.head = new Node(head.data, null);
        Node tmpTwin = copy3.head;
        while(tmp.next != null)
        {
            tmp = tmp.next;
            tmpTwin.next = new Node(tmp.data, null);
            tmpTwin = tmpTwin.next;
        }

        return copy3;
    }



}
