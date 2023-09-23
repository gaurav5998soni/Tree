import java.util.*;

public class BFS {

    public static void main(String[] args) {
        System.out.println("Please enter value number of nodes");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter number of edges: ");
        int edges = sc.nextInt();

        Queue<Integer> queue = new LinkedList();

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
        queue.add(1);
        visited[1] = true;
        bfs(visited, nodes, queue);
    }
