import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_9_2 {
    static int N,M;
    static ArrayList<Integer> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        int[] B = new int[10001];
        Arrays.fill(B, 10001);

        B[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = A.get(i); j <= M; j++) {
                // (i - k)원을 만드는 방법이 존재하는 경우
                if (B[j - A.get(i)] != 10001) {
                    B[j] = Math.min(B[j], B[j - A.get(i)] + 1);
                }
            }
        }

        // 계산된 결과 출력
        if (B[M] == 10001) { // 최종적으로 M원을 만드는 방법이 없는 경우
            System.out.println(-1);
        }
        else {
            System.out.println(B[M]);
        }
    }
}
