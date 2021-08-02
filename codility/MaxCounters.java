import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

// FAILED = Scored 77%

class MaxCounters {
    public static void main(String[] args) throws IOException {
        // 단순 공백 기준 여러개 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int K = 7;
        st = new StringTokenizer(br.readLine());
        int[] A = new int[K];
        for (int i = 0; i < K; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

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
        
        // return res_arr;
    }
}
