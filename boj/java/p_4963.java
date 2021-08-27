import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_4963 {
    static int dx[] = { -1, 1, 0, 0, 1, 1,-1,-1 };
    static int dy[] = { 0, 0, -1, 1,-1, 1, 1,-1 };
    static int[][] A;
    static int N,M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            if (M == 0 && N == 0)
                return;
            
            A = new int[N][M];
    
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            solution();
        }
    }

    public static void solution() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 1) {
                    count++;
                    bfs(i, j);
                }
            }
        }

        System.out.println(count);
    }
    
    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));

        while (!q.isEmpty()) {
            Node node = q.poll();
            
            for (int d = 0; d < 8; d++) {
                int xx = node.x + dx[d];
                int yy = node.y + dy[d];

                if (xx < 0 || yy < 0 || xx >= N || yy >= M)
                    continue;
                if (A[xx][yy] != 1)
                    continue;

                Node newNode = new Node(xx, yy);
                A[newNode.x][newNode.y] = 2;
                q.add(newNode);
            }
        }
    }

    static class Node {
        int x;
        int y;

        Node(int ix, int iy) {
            x = ix;
            y = iy;
        }
    }
}
