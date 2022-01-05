package Algorithm.Graph.MinimumSpanningTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class KruskalPathTest1 {

    // Union-Find 알고리즘 메서드 작성
    HashMap<String, String> parent = new HashMap<String, String>();
    HashMap<String, Integer> rank = new HashMap<String, Integer>();

    public String find(String node) {
        // path compression 기법
        if(parent.get(node) != node) {
            parent.put(node, find(parent.get(node)));
        }

        return parent.get(node);
    }

    public void union(String nodeV, String nodeU) {
        String root1 = find(nodeV);
        String root2 = find(nodeU);

        // union-by-rank 기법
        if(rank.get(root1) > rank.get(root2)) {
            parent.put(root2, root1);
        } else {
            parent.put(root1, root2);
            if(rank.get(root1) == rank.get(root2)) {
                rank.put(root2, rank.get(root2) + 1);
            }
        }
    }

    public void makeSet(String node) {
        parent.put(node, node);
        rank.put(node, 0);
    }

    public ArrayList<Edge> KruskalFunc(ArrayList<String> vertices, ArrayList<Edge> edges) {
        ArrayList<Edge> mst = new ArrayList<Edge>();
        Edge currentNode;
        int weight;
        String nodeV, nodeU;

        // 1.초기화
        for(int index = 0; index < vertices.size(); index++) {
            makeSet(vertices.get(index));
        }

        // 2.간선 weight 기반, sorting
        Collections.sort(edges);

        for(int index = 0; index < edges.size(); index++) {
            currentNode = edges.get(index);
            if(find(currentNode.nodeV) != find(currentNode.nodeU)) {
                union(currentNode.nodeV, currentNode.nodeU);
                mst.add(currentNode);
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        ArrayList<String> verties = new ArrayList<String>(
            Arrays.asList("A", "B", "C", "D", "E", "F", "G")
        );
        ArrayList<Edge> edges = new ArrayList<Edge>();
        edges.add(new Edge(7, "A", "B"));
        edges.add(new Edge(5, "A", "D"));
        edges.add(new Edge(7, "B", "A"));
        edges.add(new Edge(8, "B", "C"));
        edges.add(new Edge(9, "B", "D"));
        edges.add(new Edge(7, "B", "E"));
        edges.add(new Edge(8, "C", "B"));
        edges.add(new Edge(5, "C", "E"));

        System.out.println(verties);
        System.out.println(edges.toString());
    }

}

class Edge implements Comparable<Edge> {
    public int weight;
    public String nodeV;
    public String nodeU;

    public Edge(int weight, String nodeV, String nodeU) {
        this.weight = weight;
        this.nodeV = nodeV;
        this.nodeU = nodeU;
    }

    public String toString() {
        return "(" + this.weight + ", " + this.nodeV + ", " + this.nodeU + ")";
    }

    @Override
    public int compareTo(Edge edge) {
        return this.weight - edge.weight;
    }
}
