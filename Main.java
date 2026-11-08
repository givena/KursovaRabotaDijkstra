import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 5))
        )));

        adj.add(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(0, 5)),
                new ArrayList<>(Arrays.asList(2, 3)),
                new ArrayList<>(Arrays.asList(4, 7))
        )));

        adj.add(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 3)),
                new ArrayList<>(Arrays.asList(3, 4))
        )));

        adj.add(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(2, 4)),
                new ArrayList<>(Arrays.asList(4 ,6))
        )));

        adj.add(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 7)),
                new ArrayList<>(Arrays.asList(3, 6)),
                new ArrayList<>(Arrays.asList(5,6))
        )));
        adj.add(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(4,6))
        )));

        int src = 2;
            System.out.println(adj.toString());

        ArrayList<Integer> dist = Djikstra.DjikstraAlgo(adj, src);

        System.out.println(dist);
    }
}
