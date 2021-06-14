import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class p_6077 {
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

        int N = 0;
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            N = Integer.valueOf(in.readLine());
        } catch (IOException e) {
            System.err.println("error!");
        }
        for (int i = 0; i < coinTypes.length; i++) {
            count += N / coinTypes[i];
            N %= coinTypes[i];
        }

        System.out.println(count);
    }
}
