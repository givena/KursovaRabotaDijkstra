import java.util.ArrayList;
import java.util.PriorityQueue;

public class Djikstra {
public static ArrayList<Integer> DjikstraAlgo(ArrayList<ArrayList<ArrayList<Integer>>> adj,int src){
    int V= adj.size();
    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
    ArrayList<Integer> distToElement =new ArrayList<>();
    for(int i=0;i<V;i++){
        distToElement.add(Integer.MAX_VALUE);
    }
    //Слагаме на началния елемент на алгоритъма да има тежест нула
    distToElement.set(src,0);
    pq.offer(new int[]{0,src});
    while(!pq.isEmpty()){
        int distance=pq.peek()[0];
        //Това елемента в който се намираме
        int element=pq.peek()[1];
        pq.poll();
        if(distance>distToElement.get(element)){
            continue;
        }
        for(ArrayList<Integer>current:adj.get(element)){
            int currentElement=current.get(0);
            int currentweight =current.get(1);
            if(currentweight+distance <distToElement.get(currentElement) ){
                distToElement.set(currentElement, currentweight+distance);
                pq.offer(new int[]{distToElement.get(currentElement),currentElement});
            }
        }
    }
    return distToElement;
}
}
