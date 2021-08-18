import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class DFS {
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int N, M, count;
    // 인접 행렬
    static int[][] A;
    static boolean[][] check;

    // 인접 리스트
    // static ArrayList<ArrayList<Integer>> A = = new ArrayList<>();
    // static boolean[] check;
    // static int sector_size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 인접 행렬
        A = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 인접 리스트
        // st = new StringTokenizer(br.readLine());
        // int V = Integer.parseInt(st.nextToken());

        // for (int i = 0; i <= N; i++) {
        //     A.add(new ArrayList<Integer>());
        // }

        // check = new boolean[N + 1];

        // for (int i = 0; i < V; i++) {
        //     st = new StringTokenizer(br.readLine());

        //     int X = Integer.parseInt(st.nextToken());
        //     int Y = Integer.parseInt(st.nextToken());

        //     A.get(X).add(Y);
        //     A.get(Y).add(X);
        // }

        solution();
    }

    public static void solution() {
        // 인접 행렬
        check = new boolean[N][M];
        dfs(0, 0);

        // 인접 리스트
        // sector_size = 0;

        // dfs(1);

        // System.out.println(sector_size - 1);
    }

    // 인접 행렬
    static void dfs(int x, int y) {
        check[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int xx = x + dx[d];
            int yy = y + dy[d];

            if (xx == N - 1 && yy == M - 1) {
                System.out.println(A[x][y] + 1);
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

    // 인접 리스트
    // static void dfs(int x) {
    //     check[x] = true;
    //     sector_size++;

    //     for(int i=0; i<A.get(x).size(); i++){
    //         int y = A.get(x).get(i);
    //         if(!check[y]){
    //             dfs(y);
    //         }
    //     }
    // }
}
