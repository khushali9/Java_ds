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
        if(N.right==null) ;//This is wrong if it Null then look into the book we will need Paren
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
        //Time Complexity: O(n)
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


    //print element K distnace from root
    void printKDistant(Node node, int k) {
        if (node == null) {
            return;
        }
        if (k == 0) {
            System.out.print(node.data + " ");
            return;
        } else {
            printKDistant(node.left, k - 1);
            printKDistant(node.right, k - 1);
        }
        //Time Complexity: O(n) where n is number of nodes in the given binary tree.


    }

    //Print Anc
    boolean printAncestors(Node node, int target) {

         /* base cases */
        if (node == null) {
            return false;
        }

        if (node.data == target) {
            return true;
        }

        /* If target is present in either left or right subtree of this node,
         then print this node */
        if (printAncestors(node.left, target)
                || printAncestors(node.right, target)) {
            System.out.print(node.data + " ");
            return true;
        }

        /* Else return false */
        return false;
    }

    //Binary Tree is subtree of binary Tree
    boolean areIdentical(Node node1, Node node2) {

        /* base cases */
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        /* Check if the data of both roots is same and data of left and right
         subtrees are also same */
        return (node1.data == node2.data
                && areIdentical(node1.left, node2.left)
                && areIdentical(node1.right, node2.right));
    }

    /* This function returns true if S is a subtree of T, otherwise false */
    boolean isSubtree(Node T, Node S) {

        /* base cases */
        if (S == null) {
            return true;
        }

        if (T == null) {
            return false;
        }

        /* Check the tree with root as current node */
        if (areIdentical(T, S)) {
            return true;
        }

        /* If the tree with root as current node doesn't match then
         try left and right subtrees one by one */
        return isSubtree(T.left, S)
                || isSubtree(T.right, S);
    }

    //Create ll of each level

    public ArrayList<LinkedList<Node>> findlevelLinkList(Node N){
        ArrayList<LinkedList<Node>> result =new ArrayList<LinkedList<Node>>();
        LinkedList<Node> list=new LinkedList<Node>();
        int level =0;
        list.add(N);
        result.add(level,list);

        while(true){
            list=new LinkedList<Node>();
            for(int i=0;i<result.get(level).size();i++){
                Node n=result.get(level).get(i);
                if(n!=null){
                    if(n.left!=null)list.add(n.left);
                    if(n.right!=null)list.add(n.right);

                }
            }
            if(list.size()>0){
                result.add(level+1,list);
            }else{
                break;
            }
            level++;

        }


        return result;
    }

    ///


}
