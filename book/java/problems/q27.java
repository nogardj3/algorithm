import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q27 {
    static int N,M;
    static Map<Integer, Integer> A = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (A.containsKey(num)) {
                A.put(num, A.get(num) + 1);
            }
            else
                A.put(num, 1);
        }

        solution();
    }

    public static void solution() {
        System.out.println(A.containsKey(M) ? A.get(M) : -1);
    }
}
