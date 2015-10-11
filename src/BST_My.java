import java.util.*;

/**
 * Created by khushali on 10/7/15.
 */
public class BST_My {

    private class Node{
        private int data;
        private Node left,right;

        public Node(int data,Node l, Node r){
            this.data=data;
            left=l;
            right=r;
        }

        public Node(int data){
           this(data,null,null);
        }

    } // end of Node Class


    private Node root;


    public BST_My(){
        root=null;

    }



    //INSERT
    public void insert(int data){
        root=insert(root,data);
    }

    private Node insert(Node N, int toInsert){

        if (N==null) return new Node(toInsert);

        if(N.data==toInsert) return N;

        if(N.data<toInsert)
            N.right=insert(N.right,toInsert);
        else
            N.left=insert(N.left,toInsert);
        return N;

    }

    //Search
    public boolean search(int toSearch)
    {
        return search(root, toSearch);
    }
    private boolean search(Node N, int toSearch)
    {
        if (N==null) return false;

        if(N.data==toSearch) return true;

        if(N.data<toSearch)
            return search(N.right, toSearch);
        else
            return search(N.left, toSearch);



    }

    //Delete
    public void delete(int toDelete){
        root= delete(root,toDelete);
    }
    public Node delete(Node N,int toDelete){
        if (N==null) throw new RuntimeException("cannot delete");
        else if(toDelete<N.data) N.left=delete(N.left,toDelete);
        else if(toDelete>N.data) N.right=delete(N.right,toDelete);
        else
        {
            if (N.left == null) return N.right;
            else
            if (N.right == null) return N.left;
            else
            {
                // get data from the rightmost node in the left subtree
                N.data = retrieveData(N.left);
                // delete the rightmost node in the left subtree
                N.left =  delete(N.left, N.data) ;
            }
        }
        return N;



    }

    private int retrieveData(Node N)
    {
        while (N.right != null) N = N.right;

        return N.data;
    }

    //Trvarsal
    public void preOrderTraversal()
    {
        preOrderHelper(root);
    }
    private void preOrderHelper(Node r)
    {
        if (r != null)
        {
            System.out.print(r+" ");
            preOrderHelper(r.left);
            preOrderHelper(r.right);
        }
    }

    public void inOrderTraversal()
    {
        inOrderHelper(root);
    }
    private void inOrderHelper(Node r)
    {
        if (r != null)
        {
            inOrderHelper(r.left);
            System.out.print(r+" ");
            inOrderHelper(r.right);
        }
    }

}
