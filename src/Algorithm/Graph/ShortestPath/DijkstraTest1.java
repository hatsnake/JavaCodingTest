package Algorithm.Graph.ShortestPath;

import java.util.PriorityQueue;

public class DijkstraTest1 {
    public static void main(String[] args) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
        priorityQueue.add(new Edge(2, "A"));
        priorityQueue.add(new Edge(5, "B"));
        priorityQueue.offer(new Edge(1, "C"));
        priorityQueue.offer(new Edge(7, "D"));

        System.out.println(priorityQueue);
        // 최상단 값을 가져오기만 하기(해당 값이 삭제되지는 않음)
        System.out.println(priorityQueue.peek());

        // 최상단 값을 가져오고, 해당 값을 삭제함
        // (내부적으로 두번째 우선순위 값이 최상단으로 이동
        Edge edge1 = priorityQueue.poll();
        System.out.println(edge1);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.size());
    }
}

class Edge implements Comparable<Edge> {
    public int distance;
    public String vertex;

    public Edge(int distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    public String toString() {
        return "vertex : " + this.vertex + ", distance : " + this.distance;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.distance - edge.distance;
    }
}
