import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q40 {
    static int N,M;
    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static int[] D;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
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

    public static void solution() {
        D = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            Collections.sort(A.get(i));
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        D[1] = 1;

        while (!q.isEmpty()) {
            int next = q.poll();

            for (Integer i : A.get(next)) {
                if (D[i] == 0) {
                    q.offer(i);
                    D[i] = D[next] + 1;
                }
                // else
                //     D[next]+=1;
            }
        }

        int max = Arrays.stream(D).max().getAsInt();
        ArrayList<Integer> resList = new ArrayList<>();
        for (int i = 0; i < D.length; i++) {
            if (D[i] == max) {
                resList.add(i);
            }
        }

        System.out.println(resList.get(0) + " " + (max-1) + " " + resList.size());
    }
    
    static void print() {
        for (int i = 1; i <= N; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();
    }
}
