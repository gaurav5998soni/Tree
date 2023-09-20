package com.coding.challange.tree;

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

        for(int i: nodes.get(1)){
            System.out.print(i+" ");
        }


    }
}
