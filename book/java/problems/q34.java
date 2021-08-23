import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q34 {
    static int N;
    static ArrayList<Integer> A = new ArrayList<>(),DP = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer 
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
            DP.add(1);
        }
        
        solution();
    }

    public static void solution() {
        Collections.reverse(A);

        for (int i = 1; i < A.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (A.get(j) < A.get(i))
                    DP.set(i, Math.max(DP.get(i), DP.get(j) + 1));
            }
            
        }

        print();
    }
    
    static void print() {
        for (int i = 0; i < N; i++) {
            System.out.print(DP.get(i) + " ");
        }
        System.out.println();

        System.out.println(Collections.max(DP));
    }
}
