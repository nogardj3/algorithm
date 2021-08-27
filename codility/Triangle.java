import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Triangle {
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
        Arrays.sort(A);

        int res = 0;
        for (int i = 0; i < A.length - 2; i++) {
            if ((long) A[i] + (long)A[i + 1] > (long)A[i + 2]) {
                res = 1;
                break;
            }
        }
        System.out.println(res);
    }
}
