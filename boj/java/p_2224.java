import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_2224 {
    static int N, M;
    public static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        N = 'z' - 'A' + 1;
        A = new int[N+1][N+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(A[i], (int) 1e9);
        }

        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (a == b) A[a][b] = 0;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int from = st.nextToken().charAt(0) - 'A' + 1;
            st.nextToken();
            int to = st.nextToken().charAt(0) - 'A' + 1;
            A[from][to] = 1;
        }

        solution();
    }

    public static void solution() {
        for (int k = 1; k <= N; k++) {
            for (int a = 1; a <= N; a++) {
                for (int b = 1; b <= N; b++) {
                    A[a][b] = Math.min(A[a][b], A[a][k] + A[k][b]);
                }
            }
        }

        ArrayList<String> res_list = new ArrayList<>();
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (A[a][b] < 1e9 && a != b) {
                    res_list.add((char) (a + 'A' - 1) + " => " + (char) (b + 'A' - 1));
                }
            }
        }

        System.out.println(res_list.size());
        for (String string : res_list) {
            System.out.println(string);
        }
    }
}
