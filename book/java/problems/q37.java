import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q37 {
    static int N,M;
    static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer 
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        A = new int[N + 1][N + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                A[i][j] = 100001;
            }
            A[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            
            A[x][y] = Math.min(num, A[x][y]);
        }
        
        solution();
    }

    public static void solution() {
        print();
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                for (int j2 = 1; j2 < A.length; j2++) {
                    A[j][j2] = Math.min(A[j][i] + A[i][j2], A[j][j2]);
                }
            }
        }

        print();
    }
    
    static void print() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
