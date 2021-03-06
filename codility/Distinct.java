import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Distinct {
    static int N;
    static int A[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        if (A.length == 0) {
            System.out.println(0);
        } else {
            Set<Integer> res_set = new HashSet<>();
    
            for (int integer : A) {
                res_set.add(integer);
            }
    
            System.out.println(res_set.size());
        }
    }
}
