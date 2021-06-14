import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class p_6095 {
    public static void main(String[] args) throws IOException {
        // 단순 공백 기준 여러개 받기
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int N = Integer.parseInt(st.nextToken());
        // int M = Integer.parseInt(st.nextToken());

        // n * m 2차원 배열 받기
        // int[][] arr = new int[N][M];
        // for (int i = 0; i < N; i++) {
        // String str = br.readLine();
        // for (int j = 0; j < M; j++) {
        // arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
        // }
        // }
        // System.out.print(N + " " + M);
        // for (int i = 0; i < N; i++) {
        // for (int j = 0; j < M; j++) {
        // System.out.print(arr[i][j]);
        // }
        // System.out.println();
        // }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[20][20];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        for (int i = 1; i < 20; i++) {
            String str = "";
            for (int j = 1; j < 20; j++) {
                str = str + arr[i][j] + " ";
            }
            System.out.println(str);
        }
    }
}


