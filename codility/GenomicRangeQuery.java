import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class GenomicRangeQuery {
    static String S;
    static int N;
    static int[] P,Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = st.nextToken();
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        P = new int[N];
        for (int i = 0; i < 0; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        Q = new int[N];
        for (int i = 0; i < 0; i++) {
            Q[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
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
            result[i] = map.get((char) result[i]);
        }
        
        System.out.println(Arrays.toString(result));
    }
}
