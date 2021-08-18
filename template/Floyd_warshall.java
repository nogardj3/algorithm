import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Floyd_warshall {
    static int N, M;
    public static int[][] A = new int[501][501];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 501; i++) {
            Arrays.fill(A[i], Integer.MAX_VALUE);
        }

        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (a == b) A[a][b] = 0;
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
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

        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (A[a][b] == Integer.MAX_VALUE) {
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
