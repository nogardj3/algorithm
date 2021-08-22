import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TODO 기둥과 보 설치
class q12 {
    public static int N;
    public static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        
        A = new int[N+1][N+1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0) {

            }
            if (b == 0) {
                
            }
            A[x][y] = 1;
        }

        solution();
    }

    public static void solution() {
    }

    static void changeDirection() {

    }
}
