import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MiniMaxSum {
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
    
    public static void solution(List<Integer> arr) {
        long sum = 0;
        long min = 1000000001;
        long max = 0;
        for (int integer : arr) {
            sum += integer;
            min = Math.min(min, integer);
            max = Math.max(max, integer);
        }

        System.out.println((sum - max) + " " + (sum - min));

        return ;
    }
    
}
