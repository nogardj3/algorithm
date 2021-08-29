import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class p_14496 {
    static int start, end, N, M;
    static ArrayList<ArrayList<Node>> A = new ArrayList<>();
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>());
        }
        distance = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            A.get(x).add(new Node(y, 1));
            A.get(y).add(new Node(x, 1));
        }

        solution();
    }

    public static void solution() {
        dijkstra(N);
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        distance[start] = 0;
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int dist = node.getDistance();
            int now = node.getIndex();

            if (distance[now] < dist)
                continue;

            for (int i = 0; i < A.get(now).size(); i++) {
                int cost = distance[now] + A.get(now).get(i).getDistance();

                if (cost < distance[A.get(now).get(i).getIndex()]) {
                    distance[A.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(A.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        private int index;
        private int distance;
    
        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    
        public int getIndex() {
            return this.index;
        }
    
        public int getDistance() {
            return this.distance;
        }
    
        @Override
        public int compareTo(Node other) {
            if (this.distance < other.distance) {
                return -1;
            }
            return 1;
        }
    }
}
