import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q31 {
    static int N,M;
    static ArrayList<ArrayList<Integer>> A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            A = new ArrayList<>();
            B = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                A.add(new ArrayList<Integer>());
                B.add(new ArrayList<Integer>());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                for (int j2 = 0; j2 < M; j2++) {
                    A.get(j).add(Integer.parseInt(st.nextToken()));
                    B.get(j).add(0);
                }
            }
    
            solution();
        }
    }

    public static void solution() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0) {
                    B.get(j).set(i, A.get(j).get(i));
                } else {
                    int top = 0, mid = 0, bottom = 0;
                    if (j != 0)
                        top = B.get(j - 1).get(i - 1);
                    mid = B.get(j).get(i - 1);
                    if (j != N - 1)
                        bottom = B.get(j + 1).get(i - 1);

                    B.get(j).set(i, Math.max(top, Math.max(mid, bottom)) + A.get(j).get(i));
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(B.get(i).get(M - 1),max);
        }
        System.out.println(max);
    }
    
    static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(B.get(i).get(j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
