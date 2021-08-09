import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class ChocolatesByNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(solution(N, M));
        // System.out.println(Arrays.toString(solution(N,P,Q)));
    }
    
    public static int solution(int N, int M) {
        return N / (gcd(N, M));
    }
    
    public static int gcd(int a,int b){
        if(a % b == 0)
            return b;
        else
            return gcd(b,a % b);
    }
}
