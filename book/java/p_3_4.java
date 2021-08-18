import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        while (true) {
            if (N % M == 0) {
                N /= M;
                count += 1;
            } else {
                count = count + (N % M);
                N = N - (N % M);
            }

            if (N == 1) {
                System.out.println(count);
                break;
            }
        }
    }
}
