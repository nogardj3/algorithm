import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class StoneWall {
    static int N;
    static int[] H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        int res = 0;

        Stack<Integer> iStack = new Stack<Integer>();
        iStack.push(H[0]);

        for (int i = 1; i < H.length; ++i) {
            while (!iStack.empty()) {
                if (iStack.peek() > H[i]) {
                    ++res;
                    iStack.pop();
                } else if (iStack.peek() < H[i]) {
                    iStack.push(H[i]);
                    break;
                } else
                    break;
            }
            if (iStack.empty())
                iStack.push(H[i]);
        }
        
        System.out.println(res + iStack.size());
    }
}
