import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class PalindromeIndex {
    static String s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        s = st.nextToken();

        solution();
    }
    
    public static void solution() {
        int res = -1;
        for (int i = 0; i <= (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                if (s.charAt(i + 1) == s.charAt(s.length() - 1 - i)
                        && s.charAt(i + 2) == s.charAt(s.length() - 2 - i)) {
                    res = i;
                    break;
                }
                if (s.charAt(i) == s.charAt(s.length() - 2 - i)) {
                    res = s.length() - 1 - i;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
