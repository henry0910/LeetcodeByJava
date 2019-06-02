import java.util.*;

public class Solution210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int[] degrees = new int[numCourses];
        List[] edges = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; ++i) {
            edges[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            ++degrees[pre[0]];
            edges[pre[1]].add(pre[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; ++i) {
            if (degrees[i] == 0) {
                q.offer(i);
            }
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            int n = q.poll();
            res[cnt++] = n;
            for (int i = 0; i < edges[n].size(); ++i) {
                int nei = (int) edges[n].get(i);
                --degrees[nei];
                if (degrees[nei] == 0) {
                    q.offer(nei);
                }
            }
        }
        return cnt == numCourses ? res : new int[0];
    }
    // returns null if no topological sort is possible
//    public List topological_sort_by_dfs(List<Vertex> graph) {
//        Stack stack = new Stack();
//        List<Vertex> result = new ArrayList<>();
//        for (Vertex vertex : graph) {
//            if (!vertex.visited) {
//                boolean dfs_result = dfs(vertex, stack);
//                // if cycle found then there is no topological sort possible
//                if (!dfs_result) {
//                    return null;
//                }
//            }
//        }
//        for (Vertex vertex : stack) {
//            result.add(stack.pop());
//        }
//        return result
//    }
//
//    private boolean dfs(Vertex vertex, Stack<Vertex> stack) {
//        vertex.visiting = true;
//        for (Vertex childNode : vertex.childNodes) {
//            if (!childNode.visited) {
//                // check for back-edge, i.e., cycle
//                if (childNode.visiting) {
//                    return false;
//                }
//                dfs(childNode, stack);
//            }
//        }
//        vertex.visiting = false;
//        vertex.visited = true;
//        // now that you have completely visited all the
//        // childNodes of the vertex, push the vertex in the stack
//        stack.push(vertex);
//
//        return true;
//    }

}
