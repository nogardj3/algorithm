import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TODO
class q16 {
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int[][] A;
    static int[][] check;
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
        check = new int[N][M];
        count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0 && check[i][j] == 0) {
                    count++;
                    bfs(i,j);
                }
            }
        }
        System.out.println(count);
    }
    
    public static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));
        check[x][y] = 1;

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int d = 0; d < 4; d++) {
                int xx = node.x + dx[d];
                int yy = node.y + dy[d];

                if (xx < 0 || yy < 0 || xx >= N || yy >= M)
                    continue;
                if (A[xx][yy] != 0 || check[xx][yy] == 0)
                    continue;

                Node newNode = new Node(xx, yy);
                check[newNode.x][newNode.y] = 1;
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
                System.out.print(check[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
