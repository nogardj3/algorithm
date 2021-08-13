import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_10815 {
    static int N, M;
    static Set<String> A;
    static ArrayList<Integer> B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new HashSet<>();
        for (int i = 0; i < N; i++) {
            A.add(st.nextToken());
        }

        B = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(A.contains(st.nextToken())? 1: 0);
        }

        solution();
    }

    public static void solution() {
        for (Integer has : B) {
            System.out.print(has + " ");
        }
    }
}
