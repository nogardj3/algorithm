import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6_4 {
    static int N,M;
    static ArrayList<Integer> A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        
        B = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += B.get(i);
        }
        for (int i = M; i < N; i++) {
            sum += A.get(i);
        }
        System.out.println(sum);
    }
}
