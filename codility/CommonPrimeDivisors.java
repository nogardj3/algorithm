import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class CommonPrimeDivisors {
    static int N;
    static int[] A, B;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        int count = 0;
        for (int i = 0; i < B.length; i++) {
            if (hasSamePrimeDivisors(A[i], B[i])) {
                count++;
            }
        }

        System.out.println(count);
    }
    
    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
    
	public static boolean hasSamePrimeDivisors(int a, int b) {
        int gcdValue = gcd(a,b);
        int gcdA;
        int gcdB;
        while(a!=1) {
            gcdA = gcd(a,gcdValue);
            if(gcdA==1)
                break;
            a = a/gcdA;
        }
        if(a!=1)  {
            return false;
        }
        while(b!=1) {
            gcdB = gcd(b,gcdValue);
            if(gcdB==1)
                break;
            b = b/gcdB;
        }
        return b==1;
	}
}
