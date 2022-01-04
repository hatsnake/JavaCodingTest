package Algorithm.Graph.ShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraTest2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Edge>> graph = new HashMap<String, ArrayList<Edge>>();
        graph.put("A", new ArrayList<Edge>(Arrays.asList(
                new Edge(8, "B"),
                new Edge(1, "C"),
                new Edge(2, "D")
        )));
        graph.put("B", new ArrayList<Edge>());
        graph.put("C", new ArrayList<Edge>(Arrays.asList(
                new Edge(5, "B"),
                new Edge(2, "D")
        )));
        graph.put("D", new ArrayList<Edge>(Arrays.asList(
                new Edge(3, "E"),
                new Edge(5, "F")
        )));
        graph.put("E", new ArrayList<Edge>(Arrays.asList(
                new Edge(1, "F")
        )));
        graph.put("F", new ArrayList<Edge>(Arrays.asList(
                new Edge(5, "A")
        )));

        for(String key : graph.keySet()) {
            System.out.println(key);
            System.out.println(graph.get(key));
        }

        System.out.println("================================");

        ArrayList<Edge> nodeList = graph.get("A");
        for(int index = 0; index < nodeList.size(); index++) {
            System.out.println(nodeList.get(index));
        }
    }
}