import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

// FAILED = Scored 77%

class MaxCounters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, A));
    }
    
    public static int[] solution(int N, int[] A) {
        int[] res_arr = new int[N];

        int max = 0;
        for (int i : A) {
            if (i >= 1 && i <= N) {
                res_arr[i - 1]++;
                max = Math.max(max, res_arr[i - 1]);
            } else if (i == N + 1) {
                Arrays.fill(res_arr, max);
            }
        }

        return res_arr;
    }
}
