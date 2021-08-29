import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED 

class p_10973 {
    static int N;
    static ArrayList<Integer> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        
        solution();
    }
    
    static void solution() {
        
    }
}
