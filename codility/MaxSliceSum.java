import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MaxSliceSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A));
    }
    
    public static int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        int max_local = A[0];
        int max_global = A[0];
    
        for (int i = 1; i < A.length; i++) {
            max_local = Math.max(A[i], max_local + A[i]);
            max_global = Math.max(max_local, max_global);
        }
        
        return max_global;
    }
}
