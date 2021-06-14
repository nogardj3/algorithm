import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class p_3_2 {
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
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());;
            if (i == 0) {
                max1 = num;
                max2 = num;
            }
            int max = Math.max(max1, num);
            if (max1 != max) {
                max2 = max1;
                max1 = max;
            }
        }

        int result = m / (k + 1) * ((max1 * k) + max2);
        result += m % (k + 1) * max1;

        System.out.println(result);
    }
}
