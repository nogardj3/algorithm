import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1012 {
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int[][] A;
    static boolean[][] check;
    static int N;
    static int M;
    static int sector;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            A = new int[N][M];
            check = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                
                int Y = Integer.parseInt(st.nextToken());
                int X = Integer.parseInt(st.nextToken());

                A[X][Y] = 1;
            }
            
            solution();
        }
    }

    public static void solution() {
        sector = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 1 && !check[i][j]) {
                    sector++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(sector);
    }
    
    static void dfs(int x, int y) {
        A[x][y] = 2;
        check[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int xx = x + dx[d];
            int yy = y + dy[d];
            if (xx < 0 || yy < 0 || xx >= N || yy >= M) continue;
            if (A[xx][yy] != 1 || check[xx][yy]) continue;
            dfs(xx, yy);
        }
    }
}
