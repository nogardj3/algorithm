import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TODO 뱀
class p_12_5 {
    public static int N, K, L, X = 0;
    public static int[][] A;
    static String[] directions = new String[10000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        A = new int[N+1][N+1];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            A[x][y] = 1;
        }

        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());

        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            directions[idx] = direction;
        }

        solution();
    }

    public static void solution() {
    }

    static void changeDirection() {

    }
}
