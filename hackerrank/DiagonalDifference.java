import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class DiagonalDifference {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            arr.add(new ArrayList<>());
        }
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }

        solution();
    }
    
    public static void solution() {
        int lr = 0;
        for (int i = 0; i < arr.size(); i++) {
            lr += arr.get(i).get(i);
        }

        int rl = 0;
        for (int i = 0; i < arr.size(); i++) {
            rl = arr.get(i).get(arr.get(i).size() - 1 - i);
        }
    
        System.out.println(Math.abs((lr - rl)));
    }
}
