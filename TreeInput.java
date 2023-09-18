import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeInput {
    
    public static void main(String[] args) {
        System.out.println("Please enter value number of nodes");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Enter number of edges: ");
        int edges = sc.nextInt();
        
        int[] nodes = new int[n];
        
        for(int i=0; i<edges; i++){
            List<Integer> edge = new ArrayList<>();
            int u = sc.nextInt();
            nodes[u].add(sc.nextInt());
            
        }
        
        
    }
}
