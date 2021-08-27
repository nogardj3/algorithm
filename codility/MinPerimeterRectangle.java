import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MinPerimeterRectangle {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        solution();
    }
    
    public static void solution() {
        if (N == 1)
            System.out.println(4);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(N); i++)
            if (N % i == 0) {
                min = Math.min(min, 2 * (i + N / i));
            }

        System.out.println(min);
    }
}
