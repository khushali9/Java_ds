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
        else if(N.data<toDelete) N.right=delete(N.right,toDelete);
        else if(N.data>toDelete) N.left=delete(N.left,toDelete);
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

    //code ot find the succesor
    public Node Successesor(Node N) {
        if(N==null) return null;
        if(N.right==null) return N;
        else
        {
            N=N.right;
            while(N.left!=null)
            {
                N=N.left;
            }

            return N;
        }


    }

    //Check If Tree is balanced or Not
    public int MaxDepth(Node N){
        if(N==null)
            return 0;
        else
            return 1+Math.max(MaxDepth(N.left),MaxDepth(N.right));
    }

    public int MinDepth(Node N){
        if(N==null)
            return 0;
        else
            return 1+Math.min(MinDepth(N.left), MinDepth(N.right));
    }

    public boolean isBalanced(Node N){
        return (MaxDepth(N)-MinDepth(N)<=1);
    }

    //Asc Array to Tree
    public Node addToTree(int a[],int start,int end)
    {
        if(start<end){
            return null;
        }
        else
        {
            int mid=(start+end)/2;
            Node n=new Node(a[mid],addToTree(a,start,mid-1),addToTree(a,mid+1,end));
            return n;
        }
    }

    public Node createMinBST(int a[]){
        return addToTree(a,0,a.length-1);
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }


    //
}
