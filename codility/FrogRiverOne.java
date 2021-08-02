import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class TapeEquilibrium {
    public static void main(String[] args) throws IOException {
        // 단순 공백 기준 여러개 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

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
        // return res;
    }
}
