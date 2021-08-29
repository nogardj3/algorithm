import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_5567 {
    static int N, M;
    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            A.get(x).add(y);
            A.get(y).add(x);
        }
        
        solution();
    }
    
    static void solution() {
        Set<Integer> friends = new HashSet<>();
        for (Integer friend1 : A.get(1)) {
            friends.add(friend1);
            for (Integer friend2 : A.get(friend1)) {
                if(friend2 != 1)
                    friends.add(friend2);
            }
        }

        System.out.println(friends.size());
    }
}
