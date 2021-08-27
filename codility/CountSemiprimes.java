import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class CountSemiprimes {
    static int N;
    static int[] P, Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        Q = new int[N];
        for (int i = 0; i < N; i++) {
            Q[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        int[] array = new int[50001];
        int[] flag = new int[50001];
        array[1] = 1;
        int cnt = 0;
        for (int i = 2; i < array.length; i++) {
            for (int j = 2; i * j < array.length; j++) {
                if (array[i] == 1) {
                    break;
                }
                array[i * j] = 1;
            }
        }
        for (int i = 2; i < array.length; i++) {
            for (int j = 2; i * j < array.length; j++) {
                if (array[i] == 0 && array[j] == 0) {
                    array[i * j] = 2;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                cnt++;
            }
            flag[i] = cnt;
        }
        int[] ans = new int[P.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = flag[Q[i]] - flag[P[i] - 1];
        }

        System.out.println(Arrays.toString(ans));
    }
}
