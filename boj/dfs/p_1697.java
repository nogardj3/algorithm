import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1697 {
    static ArrayList<ArrayList<Integer>> A;
    static int[] check;
    static int N,K;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        check = new int[100001];

        solution();
    }

    public static void solution() {
        if (N == K)
            System.out.println(0);
        else
            bfs(N);
    }
    
    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        check[v] = 1;
        q.add(v);

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = x + 1;
                } else if (i == 1) {
                    next = x - 1;
                } else {
                    next = x * 2;
                }

                if (next == K) {
                    System.out.println(check[x]);
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    q.add(next);
                    check[next] = check[x] + 1;
                }
            }
        }
    }
}
