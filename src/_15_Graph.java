import java.util.*;

/**
 * Created by khushali on 1/8/16.
 */
public class _15_Graph {
    int numVer;
    LinkedList<Integer> adjList[];

    public _15_Graph(int v) {
        numVer = numVer+1;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjList[v]=new LinkedList();
    }

    public void addEdge(int v, int edge) {
        adjList[v].add(edge);
    }


    //BFS of given source int s Time Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
    public void BFS(int s) {
        boolean visited[] = new boolean[numVer];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll(); //dequeue a vertex from Queue and print it
            System.out.print(s + " ");

            Iterator<Integer> i = adjList[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    //for to check route between two nodes...add this lines
                    // if(n==end) return true end is needs to be passed.else part put tfollowing lijnes
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }//end of While
    }


    //DFS , uses stack

    public void dfs() {
        boolean visited[] = new boolean[numVer];
        for (int i = 0; i <numVer; i++) {
            if (visited[i] == false) {
                DFSUtil(i, visited);
            }
        }
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }

    }

    //Time Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
    //for both travarsal

    //http://www.geeksforgeeks.org/applications-of-depth-first-search/
    //http://www.geeksforgeeks.org/applications-of-breadth-first-traversal/


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

    //topological sort

}