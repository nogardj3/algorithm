import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()) + 1;
        int w = Integer.parseInt(st.nextToken()) + 1;
        int[][] arr = new int[h + 1][w + 1];

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (d == 0) { // 가로
                for (int j = y; j < y + l; j++) {
                    arr[x][j] = 1;
                }
            } else {
                for (int j = x; j < x + l; j++) {
                    arr[j][y] = 1;
                }
            }
        }

        print_arr(arr, h, w);
    }

    public static void print_arr(int[][] arr, int x, int y) {
        for (int i = 1; i < x; i++) {
            String str = "";
            for (int j = 1; j < y; j++) {
                str = str + arr[i][j] + " ";
            }
            System.out.println(str);
        }
    }
}


