import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class JesseandCookies {
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
    
    public static int solution(int k, List<Integer> A) {
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
