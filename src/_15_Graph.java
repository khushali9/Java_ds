import java.util.*;

/**
 * Created by khushali on 1/8/16.
 */
public class _15_Graph {
    int numVer;
    int numEdge;
    public _15_Graph(){
        numVer=0;
        numEdge=0;
    }

    public int getNumEdges(){
        return numEdge;
    }

    public int getNumVert(){
        return numVer;
    }

    public void addVer(){
        //Impl add vertx
        numVer++;
    }

}

class graphAdj extends _15_Graph{
    private int[][] adjMat;

    //Adgecency matrix -> need matrix and if edge it shows 1 but when we have to add
    //vertex then we have to increment the whole matrix size so that is bit of a work

    //lets see adgecensy list

    private Map<Integer,ArrayList<Integer>> adjList;
    public void implementAddEdg(int v,int w){
        adjMat[v][w]=1;
    }

    //with list
    public void implAddVertex(){
        int v=getNumVert();
        ArrayList<Integer> ngh=new ArrayList<Integer>();
        adjList.put(v,ngh); //if it is Map it is put Not "add"
    }

    public void implementAddEdge(int v,int w){
        (adjList.get(v)).add(w);
    }

    public List<Integer> getNegh(int v){
        return new ArrayList<Integer>(adjList.get(v));
        //why new cause if we send the list we have stored in otru data then nayone can modify it so we will not return that one.

    }
    //two hop
    public List<Integer> getNegh2(int v){
        ArrayList<Integer> twoHop=new ArrayList<Integer>();
        ArrayList<Integer> oneHop= adjList.get(v);

                for(int i=0;i<oneHop.size();i++){
                    twoHop.add(oneHop.get(i));
                }

        return twoHop;

    }

    //BFS of given source int s Time Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
    public void BFS(int s){
        boolean visited[]=new boolean[getNumVert()];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);

        while(!queue.isEmpty())
        {
            s=queue.poll(); //dequeue a vertex from Queue and print it
            System.out.print(s+" ");

            Iterator<Integer> i=adjList.get(s).listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                   visited[n]=true;
                    queue.add(n);
                }
            }
        }//end of While
    }


    //DFS , uses stack

    public void dfs(){
        boolean visited[]=new boolean[getNumVert()];
        for(int i=0;i<getNumVert();i++){
            if(visited[i]==false){
                DFSUtil(i,visited);
            }
        }
    }

    public void DFSUtil(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i=adjList.get(v).listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n])
                DFSUtil(n,visited);
        }

    }


    //Cycle with  un directed graph
    /*

    We have discussed cycle detection for directed graph.
    We have also discussed a union-find algorithm for cycle detection in undirected graphs.
    The time complexity of the union-find algorithm is O(ELogV). Like directed graphs,
    we can use DFS to detect cycle in an undirected graph in O(V+E) time.
    We do a DFS traversal of the given graph.
    For every visited vertex ‘v’, if there is an adjacent ‘u’ such that u is already visited
    and u is not parent of v, then there is a cycle in graph.
    */


    //so in DFS have one more input as parent

    //call it like wise  if (isCyclicUtil(u, visited, -1))
    //and if1visited code's else would be
    //// If an adjacent is visited and not parent of current
    // vertex, then there is a cycle.
   // else if (i != parent)
     //       return true;
//http://www.geeksforgeeks.org/detect-cycle-undirected-graph/

    //is Cycle Using DisjointSet UNdirected Graph
    //http://www.geeksforgeeks.org/union-find/


    //topological sorting
    //http://www.geeksforgeeks.org/topological-sorting/

    //read http://www.geeksforgeeks.org/assign-directions-to-edges-so-that-the-directed-graph-remains-acyclic/

}
