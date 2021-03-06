import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Nesting {
    static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = st.nextToken();

        solution();
    }
    
    public static void solution() {
        if(S.length()== 0)
            System.out.println(1);

        int res = 1;

        Stack<Character> cStack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                cStack.push('(');
            else {
                if (cStack.size() == 0) {
                    res = 0;
                    break;
                } else {
                    cStack.pop();
                }
            }
        }
        
        if (cStack.size() != 0)
            res = 0;

        System.err.println(res);
    }
}
