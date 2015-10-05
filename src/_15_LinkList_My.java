/**
 * Created by khushali on 10/4/15.
 */
public class _15_LinkList_My {
    public int data;
    public _15_LinkList_My next;
    private _15_LinkList_My first;

    //Constructor
    public _15_LinkList_My(int data){
        this.data=data;
        this.first= null;
    }

    public boolean isEmpty(){
        return (this.first==null);
    }

    public void insertFirst(int data){
        if(this.isEmpty()) {
            this.first.data = data;
        }
        else{
            _15_LinkList_My temp= new();
            this.first=data;
        }
    }

    public void display(){
        System.out.println("Data :"+this.data+" Next :" +this.next);
    }

}
