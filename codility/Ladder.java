import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class Ladder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A,B));
        // System.out.println(Arrays.toString(solution(N,P,Q)));
    }
    
    public static int[] solution(int[] A, int[] B) {
        int L = A.length;
        int[] fib = new int[L+2];
        int[] result = new int[L];
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= L; i++) {
            fib[i] = (fib[i-1] + fib[i-2]) % (1 << 30);
        }
        for (int i = 0; i < L; i++) {
            result[i] = fib[A[i]] % (1 << B[i]);
        }
        return result;
    }
    
}
