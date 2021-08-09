import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class SimpleTextEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(st.nextToken());

        Stack<String> saved_S = new Stack<>();
        String cur_S = "";

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            if (op == 1) {
                saved_S.push(cur_S);
                cur_S += st.nextToken();
            }
            else if (op == 2) {
                saved_S.push(cur_S);
                int idx = Integer.parseInt(st.nextToken());
                cur_S = cur_S.substring(0, cur_S.length() - idx);
            }
            else if (op == 3) {
                int idx = Integer.parseInt(st.nextToken()) - 1;
                System.out.println(cur_S.charAt(idx));
            }
            else if (op == 4) {
                cur_S = saved_S.pop();
            }
        }
    }
    
    public static int solution(int Q) {
        return 0;
    }
}
