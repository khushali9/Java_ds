import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        adjList.put(v,ngh);
    }

    public void implementAddEdge(int v,int w){
        (adjList.get(v)).add(w);
    }

    public List<Integer> getNegh(int v){
        return new ArrayList<Integer>(adjList.get(v)); //why new cause if we send the list we have stored in otru data then nayone can modify it so we will not return that one.

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



}
