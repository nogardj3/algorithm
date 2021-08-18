import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1260 {
    static boolean[] check;
    static int[][] A;
    static int N, M, V;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        check = new boolean[N+1];
        A = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            A[x][y] = 1;
            A[y][x] = 1;
        }

        solution();
    }

    public static void solution() {
        dfs(V);
        Arrays.fill(check,false);
        System.out.println();
        bfs(V);
    }
    
    static void dfs(int x) {
        check[x] = true;
        System.out.print(x + " ");

        for (int i = 1; i <= N; i++) {
            if (!check[i] && A[x][i] == 1) {
                dfs(i);
            }
        }
    }
    
    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        check[v] = true;
        q.offer(v);

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x + " ");
            for(int i=1; i<=N; i++){
                if(!check[i] && A[x][i] == 1){
                    check[i] =true;
                    q.offer(i);
                }
            }
        }
    }
}
