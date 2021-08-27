import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_2178 {
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int[][] A;
    static int[][] check;
    static int N,M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        check = new int[N][M];

        for (int i = 0; i < A.length; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            
            for (int j = 0; j < str.length(); j++) {
                A[i][j] = str.charAt(j) - '0';
            }
        }

        solution();
    }

    public static void solution() {
        bfs(0,0);
    }
    
    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        check[x][y] = 1;
        q.add(new Node(x, y));

        while (!q.isEmpty()) {
            Node node = q.poll();
            
            if (node.x == N - 1 && node.y == M - 1) {
                System.out.println(A[node.x][node.y]);
                break;
            }
            else {
                for (int d = 0; d < 4; d++) {
                    int xx = node.x + dx[d];
                    int yy = node.y + dy[d];

                    if (xx < 0 || yy < 0 || xx >= N || yy >= M)
                        continue;
                    if (A[xx][yy] != 1 || check[xx][yy] == 1)
                        continue;
                    Node newNode = new Node(xx, yy);
                    A[newNode.x][newNode.y] = A[node.x][node.y] + 1;
                    q.add(newNode);
                    check[newNode.x][newNode.y] = check[newNode.x][newNode.y]+1;
                }
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
