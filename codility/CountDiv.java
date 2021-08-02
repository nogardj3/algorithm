import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class PermCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        if(A == 0){
            // return (B / K) +1;
        }
        else {
            int res = 0;
            res = (B / K) - (A / K);

            if (A % K == 0)
                res++;

            System.out.println(res);
            // return res;
            
            // return ++last_val;
        }
        
    }
}
