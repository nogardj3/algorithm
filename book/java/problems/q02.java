import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q02 {
    public static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = st.nextToken();

        solution();
    }

    public static void solution() {
        int res =S.charAt(0) - '0';
        for (char i = 1; i < S.length(); i++) {
            int num = S.charAt(i) - '0';

            if(res > 1 && num > 1)
                res *= num;
            else
                res += num;
        }

        System.out.println(res);
    }
}
