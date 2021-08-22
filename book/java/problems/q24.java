import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q24 {
    static int N;
    static ArrayList<Integer> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        if (N == 1)
            System.out.println(0);
        else {
            Collections.sort(A);

            int idx1 = A.get((N - 1) / 2);

            System.out.println(idx1);
        }
    }
}
