import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountingSort1 {
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
        List<Integer> iarray = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            iarray.add(0);
        }

        for (Integer integer : arr) {
            iarray.set(integer, iarray.get(integer) + 1);
        }

        System.out.println(iarray.toString());
    }
}
