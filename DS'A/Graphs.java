import java.util.HashMap;
import java.util.LinkedList;

public class Graphs {
    int numberOfNodes = 0;
    HashMap<Integer,LinkedList<Integer>> map = new HashMap<>();

    public void addVertex(int vertex) {
        this.map.put(vertex, new LinkedList<Integer>());
        this.numberOfNodes++;
    }

    public void addEdges(int E1,int E2) {
        this.map.get(E1).add(E2);
        this.map.get(E2).add(E1);
    }

    public void showGraph(){
        for(var i:this.map.entrySet()){
            System.out.println(i.getKey() + "=>" + i.getValue());
        }
    }
    public static void main(String[] args) {
        Graphs g = new Graphs();
        g.addVertex(0);
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);
        g.addEdges(0,1);
        g.addEdges(1,2);

        g.showGraph();
    }
}
