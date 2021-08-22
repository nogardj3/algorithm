import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q03 {
    public static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = st.nextToken();

        solution();
    }

    public static void solution() {
        int count0 = 0, count1 = 0;

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                if(S.charAt(i + 1)== '1')
                    count0 += 1;
                else
                    count1 += 1;
            }
        }

        System.out.println(Math.min(count0,count1));
    }
}
