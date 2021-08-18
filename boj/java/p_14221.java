import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class p_14221 {
    static int start, end, N, M;
    static int[][] A;

    static ArrayList<Integer> home = new ArrayList<>(), con = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N+1][N+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(A[i], (int) 1e9);
        }

        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (a == b) A[a][b] = 0;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            A[from][to] = 1;
            A[to][from] = 1;
        }

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < start; i++) {
            home.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < end; i++) {
            con.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        for (int k = 1; k <= N; k++) {
            for (int a = 1; a <= N; a++) {
                for (int b = 1; b <= N; b++) {
                    A[a][b] = Math.min(A[a][b], A[a][k] + A[k][b]);
                }
            }
        }

        ArrayList<Integer> res_set = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < home.size(); i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] < min) {
                    res_set.clear();
                    res_set.add(i);
                    min = A[i][j];
                } else if (A[i][j] == min)
                    res_set.add(i);
            }
        }
        
        Collections.sort(res_set);
        System.out.println(res_set.get(0));
    }
}
