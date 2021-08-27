import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Brackets {
    static String S;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = st.nextToken();

        solution();
    }
    
    public static void solution() {
        int res = 1;

        Map<Character, Character> char_map = new HashMap<>();
        char_map.put('(', ')');
        char_map.put('{', '}');
        char_map.put('[', ']');
        
        Set<Character> kSet = char_map.keySet();

        Stack<Character> open_char = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (kSet.contains(S.charAt(i))) {
                open_char.push(S.charAt(i));
            } else {
                if (open_char.size() == 0 || char_map.get(open_char.peek()) != S.charAt(i)) {
                    res = 0;
                    break;
                } else {
                    open_char.pop();
                }
            }
        }
        
        if (open_char.size() != 0) {
            res = 0;
        }

        System.out.println(res);
    }
}
