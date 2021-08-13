import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_8_2 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        

        solution();
    }

    public static void solution() {
        int[] A = new int[30001];

        for (int i = 2; i <= N; i++) {
            A[i] = A[i - 1] + 1;
            if (i % 2 == 0)
            A[i] = Math.min(A[i], A[i / 2] + 1);
            if (i % 3 == 0)
            A[i] = Math.min(A[i], A[i / 3] + 1);
            if (i % 5 == 0)
            A[i] = Math.min(A[i], A[i / 5] + 1);
        }

        System.out.println(A[N]);
    }
}
