import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
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
