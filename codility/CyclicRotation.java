import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CyclicRotation {
    static int N,K;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }

    public static int[] solution() {
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
