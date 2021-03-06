import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[][] arr = new int[10][10];
        int start_x = 1;
        int start_y = 1;
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 10; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            if (arr[start_x][start_y] == 2) {
                arr[start_x][start_y] = 9;
                break;
            } else {
                arr[start_x][start_y] = 9;
                if (arr[start_x][start_y + 1] != 1)
                    start_y++;
                else if (arr[start_x + 1][start_y] != 1)
                    start_x++;
                else
                    break;
            }
        }

        print_arr(arr, 10, 10);
    }

    public static void print_arr(int[][] arr, int x, int y) {
        for (int i = 0; i < x; i++) {
            String str = "";
            for (int j = 0; j < y; j++) {
                str = str + arr[i][j] + " ";
            }
            System.out.println(str);
        }
    }
}


