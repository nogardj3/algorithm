import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class OddOccurrencesInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A));
    }
    
    public static int solution(int[] A) {
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
