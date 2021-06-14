import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class p_6083 {
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

        String ret = "";
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 3 | i % 10 == 6 | i % 10 == 9)
                ret = ret + "X ";
            else
                ret = ret + i + " ";
        }

        System.out.println(ret);
    }
}


