import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class BalancedBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        // solution(A);
    }
    
    public static String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);

            if(bracket == '{'||
                bracket == '(' ||
                bracket == '['){
                    stack.add(bracket);
                }
                else {
                    if (stack.size() == 0) {
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

        return stack.size() == 0 ? "YES" : "NO";
    }
}
