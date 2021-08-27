import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountNonDivisible {
    static int N;
    static int A[];

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
        int[] res_arr = new int[A.length];

        Map<Integer, Integer> rMap = new HashMap<>();
        for (int i = 0; i < res_arr.length; i++) {
            if (rMap.containsKey(A[i])) {
                rMap.put(A[i], rMap.get(A[i]) + 1);
            }
            else {
                rMap.put(A[i], 1);
            }
        }

        int count;
        for (int i = 0; i < A.length; i++) {
            count = 0;

            for (int j = 1; j <= Math.sqrt(A[i]); j++)
                if (A[i] % j == 0) {
                    if (rMap.containsKey(j))
                        count += rMap.get(j);
                    if (j != A[i] / j) {
                        if (rMap.containsKey(A[i] / j))
                            count += rMap.get(A[i] / j);
                    }
                }

            res_arr[i] = A.length - count;
        }

        System.out.println(Arrays.toString(res_arr));
    }
}
