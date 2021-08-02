import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class PermMissingElem {
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
    }
    
    public static int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        } else {
            int[] tmp = new int[A.length + 2];
            for (int i = 0; i < A.length; i++) {
                tmp[A[i]] = 1;
            }

            int res = 1;
            for (int i = 1; i < tmp.length; i++) {
                if (tmp[i] != 1) {
                    res = i;
                    break;
                }
            }

            return res;
        }
    }
}
