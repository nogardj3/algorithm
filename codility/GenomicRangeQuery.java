import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class GenomicRangeQuery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] P = new int[n];
        for (int i = 0; i < 0; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] Q = new int[n];
        for (int i = 0; i < 0; i++) {
            Q[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(S, P, Q));
    }
    
    public static int[] solution(String S, int[] P, int[] Q) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('C', 2);
        map.put('G', 3);
        map.put('T', 4);
        int[] result = new int[P.length];
        char[] chars = S.toCharArray();
        for (int i = 0; i < P.length; i++) {
            int maxVal = Integer.MAX_VALUE;
            for (int j = P[i]; j <= Q[i]; j++) {
                maxVal = Math.min(maxVal, chars[j]);
            }
            result[i] = maxVal;
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get((char)result[i]);
        }
        return result;
    }
}
