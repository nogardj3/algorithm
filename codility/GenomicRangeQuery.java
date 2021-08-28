import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class GenomicRangeQuery {
    static String S;
    static int N;
    static int[] P,Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = st.nextToken();
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        P = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Q = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Q[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        int[] result = new int[P.length];

        int[][] dp = new int[S.length()][4];

        if (S.charAt(0) == 'A')
            dp[0][0]++;
        if (S.charAt(0) == 'C')
            dp[0][1]++;
        if (S.charAt(0) == 'G')
            dp[0][2]++;
        if (S.charAt(0) == 'T')
            dp[0][3]++;
        for (int i = 1; i < S.length(); i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = dp[i - 1][j];
            }
            if (S.charAt(i) == 'A')
                dp[i][0]++;
            if (S.charAt(i) == 'C')
                dp[i][1]++;
            if (S.charAt(i) == 'G')
                dp[i][2]++;
            if (S.charAt(i) == 'T')
                dp[i][3]++;
        }

        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < 4; j++) {
                int sub_val = P[i] == 0 ? 0 : dp[P[i] - 1][j];
                if (dp[Q[i]][j] - sub_val != 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(result));
    }
}
