import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q07 {
    public static String N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = st.nextToken();

        solution();
    }

    public static void solution() {
        int half_index = N.length() / 2;
        int int_N = Integer.parseInt(N);
        
        int upper = int_N / (int)Math.pow(10,half_index);
        int bottom = int_N % (int)Math.pow(10,half_index);

        int upper_sum = 0, bottom_sum = 0;
        System.out.println(upper + "    " + bottom);
        
        while (upper > 0) {
            System.out.println(upper_sum + "   " + upper);
            upper_sum += upper % 10;
            upper /= 10;
        }
        while (bottom > 0) {
            System.out.println(bottom_sum + "   " + bottom);
            bottom_sum += bottom % 10;
            bottom /= 10;
        }

        System.out.println(upper_sum== bottom_sum ? "LUCKY" : "READY");
    }
}
