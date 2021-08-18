import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6_2 {
    static int N;
    static ArrayList<Integer> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        Collections.sort(A, Collections.reverseOrder());
        
        for (Integer integer : A) {
            System.out.print(integer+ " ");
        }
    }
}
