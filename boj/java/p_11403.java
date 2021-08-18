import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_11403 {
    static int N;
    static int[][] A;

    static ArrayList<Integer> home = new ArrayList<>(), con = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution();
    }

    public static void solution() {
        for (int k = 0; k < N; k++) {
            for (int a = 0; a < N; a++) {
                for (int b = 0; b < N; b++) {
                    if (A[a][b] == 1 || (A[a][k] == 1 && A[k][b] == 1))
                        A[a][b] = 1;
                }
            }
        }

        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++) {
                System.out.print(A[a][b] + " ");
            }
            System.out.println();
        }

    }
}
