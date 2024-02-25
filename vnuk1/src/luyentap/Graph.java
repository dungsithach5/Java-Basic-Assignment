package luyentap;

public class Graph {
	class Edge {
        int src, dest, weight;

        Edge() {
            src = dest = weight = 0;
        }
    }

    int V, E; 
    Edge edge[]; 

    Graph(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    int find(int parent[], int i) {
        if (parent[i] == i)
            return i;
        return find(parent, parent[i]);
    }

    void union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    void kruskalMST() {
        Edge result[] = new Edge[V]; 
        int e = 0; 
        int i = 0; 
        for (i = 0; i < V; ++i)
            result[i] = new Edge();

        Arrays.sort(edge, new Comparator<Edge>() {
            public int compare(Edge a, Edge b) {
                return b.weight - a.weight;
            }
        });

        int parent[] = new int[V]; 

        for (i = 0; i < V; ++i)
            parent[i] = i;

        i = 0; 

        while (e < V - 1) {
            Edge next_edge = new Edge();
            next_edge = edge[i++];

            int x = find(parent, next_edge.src);
            int y = find(parent, next_edge.dest);

            if (x != y) {
                result[e++] = next_edge;
                union(parent, x, y);
            }
        }

        System.out.println("Edges in the Maximum Spanning Tree:");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
    }
}
