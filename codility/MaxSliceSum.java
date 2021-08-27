import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MaxSliceSum {
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
        if (A.length == 1) {
            System.out.println(A[0]);
        }

        int max_local = A[0];
        int max_global = A[0];
    
        for (int i = 1; i < A.length; i++) {
            max_local = Math.max(A[i], max_local + A[i]);
            max_global = Math.max(max_local, max_global);
        }
        
        System.out.println(max_global);
    }
}
