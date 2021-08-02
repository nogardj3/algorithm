import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class CyclicRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = 0;
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(solution(A, K));
    }

    public static int[] solution(int[] A, int K) {
        if (K == 0 || A.length == 0) {
            return A;
        } else {
            K = K % A.length;
            int[] res = new int[A.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = A[(A.length + i - K) % A.length];
            }

            return res;
        }
    };
}
