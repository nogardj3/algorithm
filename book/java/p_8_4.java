import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_8_4 {
    static int N;
    static ArrayList<Integer> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        solution();
    }

    public static void solution() {
        int[] B = new int[1001];
        B[1] = 1;
        B[2] = 3;

        for (int i = 3; i <= N; i++) {
            B[i] = (B[i - 1] + 2 * B[i - 2]) % 796796;
        }

        System.out.println(B[N]); 
    }
}
