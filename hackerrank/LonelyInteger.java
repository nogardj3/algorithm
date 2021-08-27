import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class LonelyInteger {
    static List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }
    
    public static void solution() {
        Set<Integer> integerSet = new HashSet<>();

        for (Integer integer : arr) {
            if (integerSet.contains(integer)) {
                integerSet.remove(integer);
            } else {
                integerSet.add(integer);
            }
        }
        
        System.out.println(integerSet.iterator().next());
    }
}
