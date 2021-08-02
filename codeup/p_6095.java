import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6095 {
    public static void main(String[] args) throws IOException {
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


