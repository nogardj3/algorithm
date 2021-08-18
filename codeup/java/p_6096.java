import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[][] arr = new int[20][20];
        for (int i = 1; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 20; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            for (int j = 1; j < 20; j++) {
                arr[j][t2] = arr[j][t2] == 0 ? 1 : 0;
            }
            for (int j2 = 1; j2 < 20; j2++) {
                arr[t1][j2] = arr[t1][j2] == 0 ? 1 : 0;
            }
        }

        print_arr(arr);
    }

    public static void print_arr(int[][] arr) {
        for (int i = 1; i < 20; i++) {
            String str = "";
            for (int j = 1; j < 20; j++) {
                str = str + arr[i][j] + " ";
            }
            System.out.println(str);
        }
    }
}


