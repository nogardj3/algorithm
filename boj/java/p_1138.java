import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1138 {
    static int N;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            int left = Integer.parseInt(st.nextToken());

            for (int j = 0; j < N; j++) {
                if (left == 0 && A[j] == 0) {
                    A[j] = i + 1;
                    break;
                } else if (A[j] == 0) {
                    left--;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.printf("%s ",A[i]);
        }
    }
    
    static void solution() {
    }
}
