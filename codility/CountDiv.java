import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountDiv {
    static int A, B, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());

        solution();
    }
    
    
    public static void solution() {
        if (A == 0) {
            System.out.println((B / K) +1);
        } else {
            int res = 0;
            res = (B / K) - (A / K);

            if (A % K == 0)
                res++;

            System.out.println(res);
        }
    }; 

}
