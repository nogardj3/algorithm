import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TapeEquilibrium {
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
    
    public static int solution() {
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        } else {
            int pre_sum = 0;
            int tail_sum = Arrays.stream(A).sum();

            int min = 2001;
            for (int i = 0; i < A.length - 1; i++) {
                pre_sum += A[i];
                tail_sum -= A[i];
                min = Math.min(Math.abs(pre_sum - tail_sum), min);
            }

            return min;
        }
    }
}
