import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class ChocolatesByNumbers {
    static int N, M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        solution();
    }
    
    public static void solution() {
        System.out.println(N / (gcd(N, M)));
    }
    
    public static int gcd(int a,int b){
        if(a % b == 0)
            return b;
        else
            return gcd(b,a % b);
    }
}
