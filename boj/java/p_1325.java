import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1325 {
    static ArrayList<ArrayList<Integer>> A;
    static int[] check;
    static int N, M, count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        for (int i = 0; i < N+1; i++) {
            A.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int aa = Integer.parseInt(st.nextToken());
            int bb = Integer.parseInt(st.nextToken());

            A.get(bb).add(aa);
        }

        solution();
    }

    public static void solution() {
        int max = 0;
        ArrayList<Integer> max_arr = new ArrayList<>();

        for (int i = 1; i < N + 1; i++) {
            check = new int[N + 1];
            count = 0;
            bfs(i);

            if(max == count){
                max_arr.add(i);
            } else if (max < count) {
                max = count;
                max_arr.clear();
                max_arr.add(i);
            }
        }
            
        for (Integer integer : max_arr) {
            System.out.print(integer + " ");
        }
    }
    
    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        check[v] = 1;
        q.add(v);

        while (!q.isEmpty()) {
            int x = q.poll();

            for(int i=0; i<A.get(x).size(); i++){
                int y = A.get(x).get(i);
                if(check[y] == 0){
                    count++;
                    check[y] = 1;
                    q.add(y);
                }
            }
        }
    }
}
