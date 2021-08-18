import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class p_1446 {
    static int N, M, K, X;
    public static ArrayList<ArrayList<Node>> A = new ArrayList<ArrayList<Node>>();
    public static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        distance = new int[N + 1];
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

        dijkstra(X);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (distance[i] == K) {
                res.add(i);
            }
        }

        if(res.size() ==0 )
            System.out.println(-1);
        else {
            for (Integer integer : res) {
                System.out.print(integer + " ");
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
