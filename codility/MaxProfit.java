import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MaxProfit {
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
        if (A.length == 0 || A.length == 1) {
            return 0;
        }

        int res = 0;
        int min_val = -1, min_index = -1;
        int max_val = -1, max_index = -1;

        //1. min 기준 오른쪽 최대 찾기

        //2. max 기준 왼쪽 찾기
        
        
        return res;
    }
}
