import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1764 {
    static int N, M;
    static Set<String> A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A.add(st.nextToken());
        }

        B = new HashSet<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            B.add(st.nextToken());
        }

        solution();
    }

    public static void solution() {
        A.retainAll(B);

        ArrayList<String> aList = new ArrayList<>(A);
        Collections.sort(aList);
        System.out.println(aList.size());
        for (String string : aList) {
            System.out.println(string);
        }
    }
}
