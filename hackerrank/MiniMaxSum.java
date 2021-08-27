import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MiniMaxSum {
    static int N;
    static List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }
    
    public static void solution() {
        long sum = 0;
        long min = Integer.MAX_VALUE;
        long max = 0;
        for (int integer : arr) {
            sum += integer;
            min = Math.min(min, integer);
            max = Math.max(max, integer);
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
    
}
