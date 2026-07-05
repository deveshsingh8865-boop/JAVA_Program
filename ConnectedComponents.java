import java.util.*;
public class ConnectedComponents {
    static void dfs(int node,ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        visited[node] = true;
        for(int nei : graph.get(node)){
            if(!visited[nei]){
                dfs(nei, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        int n=5;
        int[][] edges = {{0,1},{1,2},{3,4}};

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] e : edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[n];
        int components = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i, graph,visited);
                components++;
            }
        }
        System.out.println(components);
    }

}
