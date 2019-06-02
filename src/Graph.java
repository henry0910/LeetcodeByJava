import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    private ArrayList<ArrayList<Integer>> vertices;
    private ArrayList<ArrayList<Integer>> reverse;
    private int[] labels;
    private int[] leader;
    private int time;
    private int source;
    private boolean[] explored;
    private Graph(String inputFileName) throws FileNotFoundException {
        vertices = new ArrayList<ArrayList<Integer>>();
        reverse = new ArrayList<ArrayList<Integer>>();
        Scanner in = new Scanner(new File(inputFileName));
        while (in.hasNextInt()) {
            int tail = in.nextInt();
            int head = in.nextInt();
            int max = Math.max(tail, head);
            while (vertices.size() < max) {
                vertices.add(new ArrayList<>());
                reverse.add(new ArrayList<>());
            }
            vertices.get(tail - 1).add(head - 1);
            reverse.get(head - 1).add(tail - 1);
        }
    }
    private int[] computeSCC() {
        int[] top5 = new int[5];
        DFSLoop1();
        DFSLoop2();
        Arrays.sort(leader);
        for (int i = 0; i < 5; i++) top5[i] = leader[leader.length - i - 1];
        return top5;
    }

    private void DFSLoop1() {
        time = 0;
        explored = new boolean[reverse.size()];
        labels = new int[vertices.size()];
        for (int i = reverse.size() - 1; i >= 0; i--) {
            if (!explored[i]) DFS1(i);
        }
    }
    private void DFSLoop2() {
        explored = new boolean[vertices.size()];
        leader = new int[vertices.size()];
        for (int i = labels.length - 1; i >= 0; i--) {
            int node = labels[i];
            if (!explored[node]) {
                source = node;
                DFS2(node);
            }
        }
    }
    private void DFS1(int node) {
        explored[node] = true;
        for (int head : reverse.get(node)) {
            if (!explored[head]) DFS1(head);
        }
        labels[time] = node;
        time++;
    }
    private void DFS2(int node) {
        explored[node] = true;
        leader[source] ++;
        for (int head : vertices.get(node)) {
            if (!explored[head]) DFS2(head);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Graph g = new Graph("src/scc.txt");
        int[] top5 = g.computeSCC();
        for (int n : top5) System.out.println(n + " ");
    }
}
