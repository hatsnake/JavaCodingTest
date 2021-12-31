package Algorithm.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

// Comparator 인터페이스
public class EdgeTest2 implements Comparable<EdgeTest2> {
    public Integer distance;
    public String vertex;

    public EdgeTest2(Integer distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }


    @Override
    public int compareTo(EdgeTest2 e) {
        return this.distance - e.distance;
    }

    public static void main(String[] args) {
        EdgeTest2 edge1 = new EdgeTest2(12, "A");
        EdgeTest2 edge2 = new EdgeTest2(10, "A");
        EdgeTest2 edge3 = new EdgeTest2(13, "A");
        EdgeTest2[] edges = new EdgeTest2[]{edge1, edge2, edge3};
        // Comparator가 Comparable보다 우선 순위가 더 높다.
        Arrays.sort(edges, new Comparator<EdgeTest2>() {
            @Override
            public int compare(EdgeTest2 e1, EdgeTest2 e2) {
                return e2.distance - e1.distance;
            }
        });
        for(int index = 0; index < edges.length; index++) {
            System.out.println(edges[index].distance);
        }
    }
}
