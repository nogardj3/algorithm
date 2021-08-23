import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q39 {
    static int N;
    static int[][] A,D;

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = { 0, 1, 0, -1 };
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer 
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int z = 0; z < T; z++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());

            A = new int[N][N];
            D = new int[N][N];
            
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < N; i++) {
                Arrays.fill(D[i],100000);
            }
            
            solution();
        }
    }

    public static void solution() {
        int x = 0, y = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(0, 0, A[x][y]));
        D[x][y] = A[x][y];

        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int dist = node.getDistance();
            x = node.getX();
            y = node.getY();
            if (D[x][y] < dist) continue;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                int cost = dist + A[nx][ny];
                if (cost < D[nx][ny]) {
                    D[nx][ny] = cost;
                    pq.offer(new Node(nx, ny, cost));
                }
            }
        }
        System.out.println(D[N - 1][N - 1]);
    }
    
    static void print() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static class Node implements Comparable<Node> {
        private int x;
        private int y;
        private int distance;
    
        public Node(int _x,int _y, int distance) {
            this.x = _x;
            this.y = _y;
            this.distance = distance;
        }
    
        public int getDistance() {
            return this.distance;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
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
