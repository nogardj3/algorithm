import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q01 {
    public static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }

    public static void solution() {
        Arrays.sort(A);
        int count = 0, res = 0;

        for (int i = 0; i < A.length; i++) {
            count += 1;
            if (count >= i) {
                res += 1;
                count = 0;
            }
        }

        System.out.println(res);
    }
}
