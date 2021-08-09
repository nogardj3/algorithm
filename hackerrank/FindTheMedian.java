import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class FindTheMedian {
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
        Collections.sort(arr);

        
    }
}
