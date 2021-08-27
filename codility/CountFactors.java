import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountFactors {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        solution();
    }
    
    public static void solution() {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(N); i++)
            if (N % i == 0) {
                count++;
                if (i != N / i)
                    count++;
            }

        System.out.println(count);
    }
}
