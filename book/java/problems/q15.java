import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q15 {
    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static int[] depths;
    static int N, M, K, X;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        depths = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>());
            depths[i] = -1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            A.get(x).add(y);
        }

        solution();
    }

    public static void solution() {
        bfs();

        boolean check = false;
        for (int i = 1; i <= N; i++) {
            if (depths[i] == K) {
                System.out.println(i);
                check = true;
            }
        }

        if (!check) System.out.println(-1);
    }
    
    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(X);
        depths[X] = 0;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int i = 0; i < A.get(now).size(); i++) {
                int nextNode = A.get(now).get(i);
                if (depths[nextNode] == -1) {
                    depths[nextNode] = depths[now] + 1;
                    q.offer(nextNode);
                }
            }
        }
    }
}
