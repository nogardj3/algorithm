import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        // solution(A);
    }
    
    public static int solution(List<List<Integer>> arr) {
        int lr = 0;
        for (int i = 0; i < arr.size(); i++) {
            lr += arr.get(i).get(i);
        }

        int rl = 0;
        for (int i = 0; i < arr.size(); i++) {
            rl = arr.get(i).get(arr.get(i).size() - 1 - i);
            System.out.println( arr.get(i).get(arr.get(i).size() - 1 - i));
        }
        
        System.out.println(lr + "  " +rl);
    
        return Math.abs((lr - rl));
    }
}
