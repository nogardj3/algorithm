import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class AbsDistinct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A));
        // System.out.println(Arrays.toString(solution(N,P,Q)));
    }
    
    public static int solution(int[] A) {
        Set<Integer> num_set = new HashSet<>();

        for (int integer : A) {
            num_set.add(Math.abs(integer));
        }

        return num_set.size();
    }
    
}
