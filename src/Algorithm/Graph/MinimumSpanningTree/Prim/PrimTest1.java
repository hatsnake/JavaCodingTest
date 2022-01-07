package Algorithm.Graph.MinimumSpanningTree.Prim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PrimTest1 {

    public static void main(String[] args) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
        priorityQueue.add(new Edge(2, "A", "B"));
        priorityQueue.add(new Edge(5, "B", "D"));
        priorityQueue.add(new Edge(3, "C", "A"));

        while(priorityQueue.size() > 0) {
            System.out.println(priorityQueue.poll());
        }

        HashMap<String, ArrayList<Edge>> graph = new HashMap<String, ArrayList<Edge>>();
        graph.put("A", new ArrayList<Edge>());
        graph.put("B", new ArrayList<Edge>());

        System.out.println(graph.containsKey("B"));
        // 찾는 키에 대한 값이 없을 때, 디폴트 값 반환
        System.out.println(graph.getOrDefault("C", new ArrayList<Edge>()));
    }
}

