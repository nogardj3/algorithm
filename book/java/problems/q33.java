import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q33 {
    static int N;
    static int[] T,P,DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer 
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        T = new int[N+1];
        P = new int[N+1];
        DP = new int[N+1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        
        solution();
    }

    public static void solution() {
        int max = 0;
        for (int i = N - 1; i >= 0; i--) {
            int time = i + T[i];
            if (time <= N) {
                max = Math.max(P[i] + DP[time], max);
            }
            DP[i]= max;
        }
        print();
    }
    
    static void print() {
        for (int i = 0; i < N; i++) {
            System.out.print(DP[i] + " ");
        }
        System.out.println();
    }
}
