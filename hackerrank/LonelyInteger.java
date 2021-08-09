import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution(A);
    }
    
    public static int solution(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : arr) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }
        
        int res = -1;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) % 2 == 1) {
                res = integer;
                return res;
            }
        }
        
        return res;
    }
}
