import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_11724 {
    static ArrayList<ArrayList<Integer>> A;
    static boolean[] check;
    static int N,V;
    static int sector_size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        A = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<Integer>());
        }

        check = new boolean[N + 1];

        for (int i = 0; i < V; i++) {
            st = new StringTokenizer(br.readLine());

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            A.get(X).add(Y);
            A.get(Y).add(X);
        }
        
        solution();
    }

    public static void solution() {
        sector_size = 0;

        for (int i = 1; i <= N; i++) {
            if(!check[i]){
                dfs(i);
                sector_size++;
            }
        }

        System.out.println(sector_size);
    }
    
    static void dfs(int x) {
        check[x] = true;

        for(int i=0; i<A.get(x).size(); i++){
            int y = A.get(x).get(i);
            if(!check[y]){
                dfs(y);
            }
        }
    }
}
