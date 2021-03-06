import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class PassingCars {
    static int N;
    static int[] A;

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
        int res = 0;
        int counting_val = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                counting_val++;
            } else {
                res += counting_val;
                if (res>1000000000) {
                    res = -1;
                    break;
                }
            }
        }

        System.out.println(res);
    }
}
