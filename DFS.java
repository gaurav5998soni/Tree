import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS {

    public static void main(String[] args) {
        System.out.println("Please enter value number of nodes");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter number of edges: ");
        int edges = sc.nextInt();

        List<List<Integer>> nodes = new ArrayList<>();

        for(int i=0; i<=n; i++){
            nodes.add(new ArrayList<Integer>());
        }

        for(int i=0; i<edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            nodes.get(u).add(v);
            nodes.get(v).add(u);
        }
        boolean[] visited = new boolean[n+1];
        dfs(visited, nodes, 1);
    }

    public static void dfs(boolean[] visited, List<List<Integer>> nodes, int source) {

        if(!visited[source]) {
            visited[source] = true;
            System.out.print(source + " ");
        }
        else{
            return;
        }

        for(int i = 0; i<nodes.get(source).size();i++) {
            dfs(visited,nodes, nodes.get(source).get(i));
        }
    }
}
