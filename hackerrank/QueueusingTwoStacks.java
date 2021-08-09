import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class QueueusingTwoStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            if (op == 1) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
            else if (op == 2) {
                queue.poll();
            }
            else if (op == 3) {
                System.out.println(queue.peek());
            }
        }
    }
    
    public static int solution(int Q) {
        return 0;
    }
}
