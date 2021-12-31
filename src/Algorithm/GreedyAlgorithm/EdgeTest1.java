package Algorithm.GreedyAlgorithm;

import java.util.Arrays;

// Comparable 인터페이스
public class EdgeTest1 implements Comparable<EdgeTest1> {
    public Integer distance;
    public String vertex;

    public EdgeTest1(Integer distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }


    @Override
    public int compareTo(EdgeTest1 e) {
        return this.distance - e.distance;
    }

    public static void main(String[] args) {
        EdgeTest1 edge1 = new EdgeTest1(12, "A");
        EdgeTest1 edge2 = new EdgeTest1(10, "A");
        EdgeTest1 edge3 = new EdgeTest1(13, "A");
        EdgeTest1[] edges = new EdgeTest1[]{edge1, edge2, edge3};
        Arrays.sort(edges);
        for(int index = 0; index < edges.length; index++) {
            System.out.println(edges[index].distance);
        }
    }
}
