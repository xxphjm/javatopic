
import java.util.*;

public class Dijkstra {
    static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    static int[] dijkstra(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int vertex = node.vertex;
            if (visited[vertex]) {
                continue;
            }
            visited[vertex] = true;
            for (int i = 0; i < n; i++) {
                if (graph[vertex][i] != 0 && distance[i] > distance[vertex] + graph[vertex][i]) {
                    distance[i] = distance[vertex] + graph[vertex][i];
                    queue.offer(new Node(i, distance[i]));
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
          
        };
        int start = 0;
        int[] distance = dijkstra(graph, start);
        System.out.println(Arrays.toString(distance));
    }
}
