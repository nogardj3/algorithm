import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TODO 치킨 배달
class q13 {
    public static int N, M;
    public static int[][] city;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()) ;
        M = Integer.parseInt(st.nextToken());
        
        city = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());
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
