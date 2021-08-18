import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_9_2 {
    static int N, M,X,K;
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
                if (a == b)
                    A[a][b] = 0;
            }
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a][b] = 1;
            A[b][a] = 1;
        }

        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

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

        System.out.println(A[1][K] + A[K][X] >= 1e9 ? -1 : A[1][K] + A[K][X]);

        
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (A[a][b] == 1e9) {
                    System.out.print("INFINITY ");
                }
                else {
                    System.out.print(A[a][b] + " ");
                }
            }
            System.out.println();
        }
    }
}