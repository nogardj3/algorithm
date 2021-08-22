import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q04 {
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
        int res = 1;

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(res<A[i])
                break;
            res += A[i];
        }

        System.out.println(res);
    }
}
