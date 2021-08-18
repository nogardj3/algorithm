import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1912 {
    static int N;
    static ArrayList<Integer> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        int[] DP = new int[N];

        DP[0] = A.get(0);
        for (int i = 1; i < N; i++) {
            DP[i] = Math.max(DP[i - 1] + A.get(i), A.get(i));
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < DP.length; i++) {
            max = Math.max(max, DP[i]);
            // System.out.print(DP[i] + " "); 
        }
        System.out.println(max);
    }
}
