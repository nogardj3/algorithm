import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class PlusMinus {
    static List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }
    
    public static void solution() {
        int plus_count = 0;
        int minus_count = 0;
        int zero_count = 0;
        for (int integer : arr) {
            if (integer < 0) {
                minus_count++;
            }
            else if (integer > 0) {
                plus_count++;
            }
            else
                zero_count++;
        }
        System.out.printf("%.6f",(float) plus_count / (float)arr.size());
        System.out.println();
        System.out.printf("%.6f",(float)minus_count / (float)arr.size());
        System.out.println();
        System.out.printf("%.6f",(float)zero_count / (float)arr.size());
        System.out.println();
    }
}
