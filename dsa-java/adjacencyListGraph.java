import java.util.*;

public class adjacencyListGraph {
    ArrayList<LinkedList<adjacencyListNode>> alist;

    adjacencyListGraph(){
        alist = new ArrayList<>();
    }
    public void addNode(adjacencyListNode node){
        LinkedList<adjacencyListNode> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }
    public void addEdge(int src, int dest){
        LinkedList<adjacencyListNode> currentList = alist.get(src);
        adjacencyListNode destNode = alist.get(dest).get(0);
        currentList.add(destNode);
    }   
    public boolean checkEdge(int src, int dest){
        LinkedList<adjacencyListNode> currentList = alist.get(src);
        adjacencyListNode destNode = alist.get(dest).get(0);

        for(adjacencyListNode node : currentList){
            if(node.data == destNode.data){
                return true;
            }
        }
        return false;
    }
    public void print(){
        for(LinkedList<adjacencyListNode> list : alist){
            for(adjacencyListNode node : list){
                System.out.print(node.data + " -> ");
            }
            System.out.println("null");
        }
    }
}
