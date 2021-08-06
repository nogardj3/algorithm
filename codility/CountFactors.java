import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountFactors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        System.out.println(solution(N));
    }
    
    public static int solution(int N) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(N); i++)
            if (N % i == 0) {
                count++;
                if (i != N / i)
                    count++;
            }

        return count;
    }
}
