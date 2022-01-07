package Algorithm.Graph.MinimumSpanningTree.ImprovementPrim;

public class Edge implements Comparable<Edge> {
    public String node;
    public int weight;

    public Edge(String node, int weight) {
        this.weight = weight;
        this.node = node;
    }

    public String toString() {
        return "" + this.weight + ", " + this.node + ")";
    }

    @Override
    public int compareTo(Edge edge) {
        return this.weight - edge.weight;
    }
}

class Path {
    public String node1;
    public String node2;
    public int weight;

    public Path(String node1, String node2, int weight) {
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
    }

    public String toString() {
        return "(" + this.node1 + ", " + this.node2 + ", " + this.weight + ")";
    }
}
