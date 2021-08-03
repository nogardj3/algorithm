import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class NumberOfDiscIntersections {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A));
    }
    
    public static int solution(int[] A) {
        int N = A.length;
        long[] lower = new long[N];
        long[] upper = new long[N];
        for (int i = 0; i < N; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }
        
        Arrays.sort(lower);
        Arrays.sort(upper);
    
        int intersection = 0;
        int j = 0; 
    
        for (int i = 0; i < N; i++) {
            while (j < N && upper[i] >= lower[j]) {
            intersection += j;
            intersection -= i;
            j++;
            }
        }
    
        if (intersection > 10000000) return -1;
        return intersection;
    }
}
