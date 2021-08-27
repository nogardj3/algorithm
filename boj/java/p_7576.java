import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_7576 {
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int[][] A;
    static int N,M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        A = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution();
    }

    public static void solution() {
        bfs();

        boolean has_zero = false;
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 0) {
                    has_zero = true;
                    break;
                }
                max = Math.max(max, A[i][j]);
            }
        }

        System.out.println(has_zero ? -1: max-1);
    }
    
    static void bfs() {
        Queue<Node> q = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 1) {
                    q.add(new Node(i, j));
                }
            }
        }

        while (!q.isEmpty()) {
            Node node = q.poll();
            
            for (int d = 0; d < 4; d++) {
                int xx = node.x + dx[d];
                int yy = node.y + dy[d];

                if (xx < 0 || yy < 0 || xx >= N || yy >= M)
                    continue;
                if (A[xx][yy] != 0)
                    continue;

                Node newNode = new Node(xx, yy);
                A[newNode.x][newNode.y] = A[node.x][node.y] + 1;
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
