import java.util.*;

/**
 * Created by khushali on 10/7/15.
 */
public class BST_My <T extends Comparable<T>>{

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
    private Comparator comp;

    public BST_My(Comparator comp){
        root=null;
        this.comp=comp;
    }

    private int compare(T x, T y)
    {
        if(comp == null) return x.compareTo(y);
        else
            return comp.compare(x,y);
    }

    //INSERT
    public void insert(int data){
        root=insert(root,data);
    }

    private Node insert(int data, int toInsert){
        
    }
}
