import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q32 {
    static int N,M;
    static int[][] A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer 
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new int[N][N];
        B = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        solution();
    }

    public static void solution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    B[i][j] = A[i][j];
                } else {
                    int left_top = 0, top;
                    if (j != 0)
                        left_top = B[i - 1][j - 1];
                    top = B[i - 1][j];

                    B[i][j] = Math.max(left_top, top) + A[i][j];
                }
            }
            // print();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(B[N-1][i] ,max);
        }
        System.out.println(max);
    }
    
    static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
