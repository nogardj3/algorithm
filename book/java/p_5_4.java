import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_5_4 {
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int[][] A;
    static boolean[][] check;
    static int N, M, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

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
        check = new boolean[N][M];
        dfs(0, 0);
        printCheck();

        // check = new boolean[N][M];
        // bfs();
        // printCheck();
    }

    public static void dfs(int x, int y) {
        check[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int xx = x + dx[d];
            int yy = y + dy[d];
            
            if (xx == N-1 && yy == M-1) {
                System.out.println(A[x][y]+ 1);
                return;
            }
            if (xx < 0 || yy < 0 || xx >= N || yy >= M)
                continue;
            if (A[xx][yy] != 1 || check[xx][yy])
                continue;

            A[xx][yy] = A[x][y] + 1;
            check[x][y] = true;
            dfs(xx, yy);
        }
    }
    
    public static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0));
        check[0][0] = true;

        while (!q.isEmpty()) {
            Node node = q.poll();

            
            for (int d = 0; d < 4; d++) {
                int xx = node.x + dx[d];
                int yy = node.y + dy[d];

                if (node.x == N - 1 && node.y == M - 1) {
                    System.out.println(A[node.x][node.y]);
                    return;
                }

                if (xx < 0 || yy < 0 || xx >= N || yy >= M)
                    continue;
                if (A[xx][yy] != 1 || check[xx][yy])
                    continue;

                Node newNode = new Node(xx, yy);
                A[newNode.x][newNode.y] = A[node.x][node.y] + 1;
                check[newNode.x][newNode.y] = true;
                q.add(newNode);
            }
        }
    }
    
    public static class Node {
        int x;
        int y;

        Node(int ix, int iy) {
            x = ix;
            y = iy;
        }
    }

    public static void printCheck() {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
