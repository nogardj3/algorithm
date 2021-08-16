import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_2579 {
    static int N;
    static int[] A,DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new int[N + 1];
        DP = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i]= Integer.parseInt(st.nextToken());
        }

        solution();
    }

    public static void solution() {
        DP[1] = A[1];

        if (N >= 2) {
            DP[2] = A[1] + A[2];
        }

        for (int i = 3; i < A.length; i++) {
            DP[i] = Math.max(DP[i - 2], DP[i - 3] + A[i - 1]) + A[i];
        }

        System.out.println(DP[N]);
    }

    public static void makeFib(int last) {
    }
}
