import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MaxProfit {
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
        if (A.length == 0 || A.length == 1) {
            System.out.println(0);
        }

        int min_val = A[0];
        int max_local = 0;
        int max_global = 0;
    
        for(int i = 1; i < A.length; i++) {
            max_local = A[i] - min_val;
            if(A[i] < min_val) min_val = A[i];
    
            max_global = Math.max(max_local, max_global);
        }
    
        if (max_global < 0)
            System.out.println(0);
        else
            System.out.println(max_global);
    }
}
