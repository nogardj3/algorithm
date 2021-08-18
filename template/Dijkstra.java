import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Dijkstra {
    static int N, M, start;
    public static ArrayList<ArrayList<Node>> A = new ArrayList<ArrayList<Node>>();
    public static int[] distance = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<Node>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            A.get(Integer.parseInt(st.nextToken()))
                    .add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        solution();
    }

    public static void solution() {
        Arrays.fill(distance, (int) 1e9);

        dijkstra(start);

        for (int i = 1; i <= N; i++) {
            if (distance[i] >= 1e9) {
                System.out.println("INFINITY");
            } else {
                System.out.println(distance[i]);
            }
        }
    }
    
    public static void dijkstra(int start) {
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
