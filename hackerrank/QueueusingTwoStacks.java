import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class QueueUsingTwoStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < q; i++) {
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
}
