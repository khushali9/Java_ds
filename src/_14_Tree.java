/**
 * Created by khushali on 1/8/16.
 */
public class _14_Tree {
    class Node{
        int data;
        Node left;
        Node right;
    }


    private Node root;

    public Node find(int key){
        Node tmp=root;
        while(tmp.data !=key){
            if(key<tmp.data)
                tmp=tmp.left;
            else
                tmp=tmp.right;
            if(tmp==null){
                return null;
            }


        }
        return tmp;

    }
    public void insert(int id){
        Node newNode=new Node();
        newNode.data=id;
        if(root==null)root=newNode;
        else{
            Node tmp=root;
            Node parent;
            while (true){
                parent=tmp;
                if(id<tmp.data){
                    tmp=tmp.left;
                    if(tmp==null){
                        parent.left=newNode;
                        return;
                    }
                }
                else{
                    tmp=tmp.right;
                    if(tmp==null){
                        parent.right=newNode;
                        return;
                    }
                }



            }//end of while
        }

    }

    //Inorder -> call this method as root as an argument
    private void inOrder(Node N){
        if(N!=null){
            inOrder(N.left);
            System.out.print(N.data);
            inOrder(N.right);
        }

    }

    //preorde same as above -> node, left, right
    //post order -> left,right,node

    //MaxMin
    public Node minNode(){
        Node tmp=root;
        Node last=tmp;
        while(tmp!=null){
            last=tmp;
            tmp=tmp.left; //for Max right
        }
        return last;
    }
    public void delete(int id){

    }
}
