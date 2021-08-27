import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class FrogRiverOne {
    static int X;
    static int[] A;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[0];
        for (int i = 0; i < 0; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }

    public static void solution() {
        Set<Integer> temp_set = new HashSet<>();

        int res = -1;
        for (int i = 0; i < A.length; i++) {
            temp_set.add(A[i]);
            if (temp_set.size() == X) {
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
}
