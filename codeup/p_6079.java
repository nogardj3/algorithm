import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6079 {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int sum = 0;

            for (int i = 0; i < 1001; i++) {
                sum += i;
                if (sum >= n) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
