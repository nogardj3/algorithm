import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_8_3 {
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
        int[] B = new int[N];
        for (int i = 2; i < N; i++) {
            B[i] = Math.max(A.get(i - 2) + A.get(i), A.get(i - 1));
        }

        System.out.println(B[N-1]);
    }
}
