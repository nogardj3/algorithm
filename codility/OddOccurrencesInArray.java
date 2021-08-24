import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class OddOccurrencesInArray {
    static int N;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static int solution() {
        Set<Integer> res_set = new HashSet<Integer>();

        if (A.length == 1) {
            return A[0];
        } else {
            for (int i = 0; i < A.length; i++) {
                if (res_set.contains(A[i]))
                    res_set.remove(A[i]);
                else
                    res_set.add(A[i]);
            }

            return res_set.iterator().next();
        }
    }
}
