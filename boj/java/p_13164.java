import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class p_13164 {
    static int N, M;
    static Map<Integer,Integer> A = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());
            if (A.containsKey(cow)) {
                if (A.get(cow) != loc) {
                    A.put(cow, loc);
                    count++;
                }
            } else {
                A.put(cow, loc);
            }
        }

        System.out.println(count);
    }

    public static void solution() {
    }
}
