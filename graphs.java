// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class graphs {

    static int nodeCount;
    static ArrayList<String> nodes;
    static ArrayList<ArrayList<Integer>> graph;

    public graphs() {
        nodeCount = 0;
        nodes = new ArrayList<>();
        graph = new ArrayList<>();
    }

    public static void addNode(String v) {
        if (nodes.contains(v)) {
            System.out.println(v + " is already present");
            return;
        }

        nodes.add(v);
        nodeCount++;
        for (ArrayList<Integer> row : graph) {
            row.add(0);
        }

        ArrayList<Integer> newRow = new ArrayList<>();
        for (int i = 0; i < nodeCount; i++) {
            newRow.add(0);
        }
        graph.add(newRow);

        System.out.println("Node added: " + v);
    }

    public static void addEdge(String v1, String v2) {
    if (!nodes.contains(v1)) {
        System.out.println("v1 is not present");
        return;
    }

    if (!nodes.contains(v2)) {
        System.out.println("v2 is not present");
        return;
    }

    int index1 = nodes.indexOf(v1);
    int index2 = nodes.indexOf(v2);

    graph.get(index1).set(index2, 1); 
    graph.get(index2).set(index1, 1); 

    System.out.println("Edge added");
}
    public static void addWeightedUndirected(String src, String dest, int weight) {
       
        System.out.println("Weighted undirected edge added");
    }

    public static void addWeightedDirected(String src, String dest, int weight) {
       
        System.out.println("Weighted directed edge added");
    }

    public static void printGraph() {
        System.out.print("    ");
        for (String node : nodes) {
            System.out.printf("%4s", node);
        }
        System.out.println();

        for (int i = 0; i < nodeCount; i++) {
            System.out.printf("%4s", nodes.get(i));

            for (int j = 0; j < nodeCount; j++) {
                System.out.printf("%4d", graph.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void deleteEdge(String src, String dest) {
        int i = nodes.indexOf(src);
        int j = nodes.indexOf(dest);

        if (i == -1 || j == -1) {
            System.out.println("Invalid nodes");
            return;
        }

        graph.get(i).set(j, 0);
        graph.get(j).set(i, 0);

        System.out.println("Edge deleted");
    }

    public static void deleteNode(String v) {
        
        
        if(!nodes.contains(v)){
            System.out.print(v+ "is not present");
        }
        else{
            int index = nodes.indexOf(v);
            
            nodes.remove(index);
            graph.remove(index);
            
            
            for(ArrayList<Integer> row : graph){
                row.remove(index);
            }
            nodeCount--;
        }
        System.out.println("Node deleted");
    }

    public static void main(String[] args) {

        graphs graphs = new graphs();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Node");
            System.out.println("2. Add Edge (Unweighted)");
            System.out.println("3. Add Edge (Weighted Undirected)");
            System.out.println("4. Add Edge (Weighted Directed)");
            System.out.println("5. Print Graph");
            System.out.println("6. Delete Edge");
            System.out.println("7. Delete Node");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Vertex: ");
                    String node = sc.next();
                    graphs.addNode(node);
                    break;

                case 2:
                    System.out.print("Source: ");
                    String s1 = sc.next();
                    System.out.print("Destination: ");
                    String d1 = sc.next();
                    graphs.addEdge(s1, d1);
                    break;

                case 3:
                    System.out.print("Source: ");
                    String s2 = sc.next();
                    System.out.print("Destination: ");
                    String d2 = sc.next();
                    System.out.print("Weight: ");
                    int w1 = sc.nextInt();
                    graphs.addWeightedUndirected(s2, d2, w1);
                    break;

                case 4:
                    System.out.print("Source: ");
                    String s3 = sc.next();
                    System.out.print("Destination: ");
                    String d3 = sc.next();
                    System.out.print("Weight: ");
                    int w2 = sc.nextInt();
                    graphs.addWeightedDirected(s3, d3, w2);
                    break;

                case 5:
                    graphs.printGraph();
                    break;

                case 6:
                    System.out.print("Source: ");
                    String s4 = sc.next();
                    System.out.print("Destination: ");
                    String d4 = sc.next();
                    graphs.deleteEdge(s4, d4);
                    break;

                case 7:
                    System.out.print("Enter node to delete: ");
                    String delNode = sc.next();
                    graphs.deleteNode(delNode);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}