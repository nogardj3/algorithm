import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MaxDoubleSliceSum {
    static int N;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        int[] inc_arr = new int[A.length];
        int[] dec_arr = new int[A.length];

        for (int i = 1; i < A.length - 1; ++i) {
            inc_arr[i] = Math.max(inc_arr[i - 1] + A[i], 0);
        }
        for (int i = A.length - 2; i > 0; --i) {
            dec_arr[i] = Math.max(dec_arr[i + 1] + A[i], 0);
        }
        
        int res = -9999999;

        for (int i = 1; i < A.length - 1; ++i) {
            res = Math.max(inc_arr[i - 1] + dec_arr[i + 1], res);
        }
        
        System.out.println(res);
    }
}
