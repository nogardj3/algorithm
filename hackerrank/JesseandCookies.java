import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class JesseandCookies {
    static int n, k;
    static List<Integer> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }
    
    public static int solution() {
        if (A.size() == 1) {
            return -1;
        }
        else {
            PriorityQueue<Integer> pQueue = new PriorityQueue<>(A);

            int count = 0;
            while (pQueue.size() > 1 && pQueue.peek() <= k) {
                int first = pQueue.poll();
                int second = pQueue.poll();
                pQueue.add(first + 2 * second);
                count++;
            }

            return count;
        }
    }
}
