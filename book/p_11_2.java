import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class p_11_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - '0';
            sum = Math.max(sum + value, sum * value);
        }
        System.out.println(sum);
    }
}
