import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class p_18111 {
    static int N;
    static ArrayList<Integer> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        solution();
    }

    public static void solution() {
        int[] B = new int[N+1];
        B[1] = 1;
        
        if(N>=2)
            B[2] = 2;

        for (int i = 3; i <= N; i++) {
            B[i] = (B[i - 1] + B[i - 2]) % 10007;
        }

        System.out.println(B[N]); 
    }
}
