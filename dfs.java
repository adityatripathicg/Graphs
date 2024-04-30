import java.util.ArrayList;

class Edge {
    int src;
    int dest;
    int wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

public class dfs {
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        // Visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Example graph
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        // Start DFS from vertex 0
        dfs(graph, 0, vis);
    }
}
