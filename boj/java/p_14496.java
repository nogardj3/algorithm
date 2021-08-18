import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class p_14496 {
    static int start, end, N, M;
    public static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
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

        // for (int a = 1; a <= N; a++) {
        //     for (int b = 1; b <= N; b++) {
        //         if (A[a][b] >= 1e9) {
        //             System.out.print("INFINITY ");
        //         } else {
        //             System.out.print(A[a][b] + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        if (start == end)
            System.out.println(0);
        else
            System.out.println(A[start][end] <= 1e9 ? A[start][end] : -1);
    }
}
