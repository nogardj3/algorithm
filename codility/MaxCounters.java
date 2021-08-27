import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MaxCounters {
    static int N, M;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        int currentMax = 0;
        int lastCalledMax = 0;
        int[] counters = new int[N];
    
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                lastCalledMax = currentMax;
            } else {
                int counter = A[i] - 1;
                if (counters[counter] < lastCalledMax) {
                    counters[counter] = lastCalledMax + 1;
                } else {
                    counters[counter]++;
                }
    
                if (counters[counter] > currentMax) {
                    currentMax = counters[counter];
                }
            }
        }
    
        for (int i = 0; i < N; i++) {
            if (counters[i] < lastCalledMax) {
                counters[i] = lastCalledMax;
            }
        }

        System.out.println(Arrays.toString(counters));
    }
}
