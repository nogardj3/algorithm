import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_10816 {
    static int N,M;
    static HashMap<Integer,Integer> A;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (A.containsKey(num))
                A.put(num, A.get(num) + 1);
            else
                A.put(num, 1);
        }
        
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (A.containsKey(num))
                sb.append(A.get(num) + " ");
            else
                sb.append(0 + " ");
        }
        System.out.println(sb.toString());
    }

    public static void solution() {

    }
}
