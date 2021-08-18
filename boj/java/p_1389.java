import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1389 {
    static int N, M;
    public static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

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
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            A[from][to] = 1;
            A[to][from] = 1;
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

        ArrayList<Integer> res = new ArrayList<>();

        int min_sum = Integer.MAX_VALUE;
        for (int a = 1; a <= N; a++) {
            int sum = 0;
            for (int b = 1; b <= N; b++) {
                sum += A[a][b];
            }

            if (min_sum > sum) {
                min_sum = sum;
                res.clear();
                res.add(a);
            } else if (min_sum == sum)
                res.add(a);
        }
        
        System.out.println(res.get(0));
    }
}
