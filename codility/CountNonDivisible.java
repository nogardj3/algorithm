import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountNonDivisible {
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
        System.out.println(Arrays.toString(solution(A)));
    }
    
    public static int[] solution(int[] A) {
        int[] res_arr = new int[A.length];
        
        int count;
        for (int i = 0; i < A.length; i++) {
            count = 0;

            for (int j = 1; j <= Math.sqrt(j); j++)
            if (A[i] % j == 0) {
                count++;
                if (j != j / i)
                    count++;
            }

            res_arr[i] = count;
        }

        return res_arr;
    }
}
