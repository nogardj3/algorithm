import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class PermCheck {
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
        Arrays.sort(A);

        int last_val = 0;
        for (int i : A) {
            if (i == last_val + 1) {
                last_val = i;
            } else if (i > last_val) {
                break;
            }
        }

        return ++last_val;
    }
}