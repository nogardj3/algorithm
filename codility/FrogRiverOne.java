import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class FrogRiverOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[0];
        for (int i = 0; i < 0; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(X, A));
    }

    public static int solution(int X, int[] A) {
        Set<Integer> temp_set = new HashSet<>();

        int res = -1;
        for (int i = 0; i < A.length; i++) {
            temp_set.add(A[i]);
            if (temp_set.size() == X) {
                res = i;
                break;
            }
        }
        return res;
    }
}
