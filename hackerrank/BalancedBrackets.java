import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class BalancedBrackets {
    static String s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        s = st.nextToken();

        solution();
    }
    
    public static String solution() {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            
            if(bracket == '{'|| bracket == '(' ||bracket == '['){
                stack.add(bracket);
            }
            else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char poped = stack.pop();
                if(poped == '{' && bracket == '}'||
                    poped == '(' && bracket == ')'||
                    poped == '[' && bracket == ']') {
                }
                else
                    return "NO";
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
