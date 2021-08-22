import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TODO 자물쇠와 열쇠
class q10 {
    public static int N, M;
    public static int[][] key, lock;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()) ;
        M = Integer.parseInt(st.nextToken());
        
        key = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                key[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        
        lock = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                lock[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution();
    }

    public static void solution() {
        for (int i = 0; i < 4; i++) {
            turnArray();
            if (checkArray()) {
                System.out.println("true");
                break;
            }
        }
    }
    
    static void turnArray() {

    }

    static boolean checkArray() {
        boolean res = true;

        return res;
    }
}
