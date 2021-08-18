import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_2667 {
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int[][] A;
    static boolean[][] check;
    static int N;
    static ArrayList<Integer> village;
    static int village_cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new int[N][N];
        check = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                A[i][j] = str.charAt(j) - '0';
            }
        }

        solution();
    }

    public static void solution() {
        int village_index = 1;
        village = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 1 && !check[i][j]) {
                    village_cnt = 0;
                    dfs(village_index, i, j);
                    village.add(village_cnt);
                    village_index++;
                }
            }
        }

        Collections.sort(village);
        
        System.out.println(village_index - 1);
        for (int cnt : village) {
            System.out.println(cnt);
        }
    }
    
    static void dfs(int vi, int x, int y) {
        village_cnt++;
        A[x][y] = vi;
        check[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int xx = x + dx[d];
            int yy = y + dy[d];
            if (xx < 0 || yy < 0 || xx >= N || yy >= N) continue;
            if (A[xx][yy] != 1 || check[xx][yy]) continue;
            dfs(vi, xx, yy);
        }
    }
}
