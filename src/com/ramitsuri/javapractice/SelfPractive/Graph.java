package com.ramitsuri.javapractice.SelfPractive;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ramitsuri on 3/11/16.
 */
public class Graph {

    ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
    int rootNode = 0;
    int numOfNodes = 0;

    boolean[] visited;

    public Graph(int numOfNodes){
        this.numOfNodes = numOfNodes;
        visited = new boolean[numOfNodes];
    }

    public Graph(int[][] adjM){
        for(int i=0;i< adjM[0].length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<adjM[0].length;j++){
                if(adjM[i][j]==1)
                    list.add(j);
            }
            this.adjList.add(list);
        }
    }

    public static ArrayList<ArrayList<Integer>> getGraph(int[][] adjM){

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i< adjM[0].length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<adjM[0].length;j++){
                if(adjM[i][j]==1)
                    list.add(j);
            }
            adjList.add(list);
        }
        return adjList;
    }

    public static void main(String args[]){
        int[][] arr = { {0,1,1,0},
                        {1,0,0,1},
                        {1,0,0,0},
                        {0,1,0,0}};

        Graph graph =  new Graph(arr);
        System.out.println(isTree(getGraph(arr)));
    }

    public static boolean isTree(ArrayList<ArrayList<Integer>> graph){
        Stack<Integer> stack = new Stack();
        stack.push(0);
       /* for (int i=0; i<graph.size();i++){
            stack.push(i);
            for(int j=0;j<graph.get(i).size();j++){
                int vertex = stack.pop();
            }
        }*/
        boolean[] visited = new boolean[graph.size()];
        while(!stack.isEmpty()){
            int vertex = stack.pop();

            ArrayList<Integer> neighbours = graph.get(vertex);
            for(int neighbour: neighbours){
                if(!visited[neighbour]) {
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }
            }
        }

        for(boolean visit:visited){
            if(!visit)
                return false;
        }
        return true;
    }

}
