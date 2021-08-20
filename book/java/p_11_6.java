import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_11_6 {
    public static int[] A;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i]++;
        }

        solution();
    }

    public static void solution() {
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            N -= A[i];
            sum += N * A[i];
        }

        System.out.println(sum);
    }
}
