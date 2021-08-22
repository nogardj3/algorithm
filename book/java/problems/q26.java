import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q26 {
    static int N;
    static PriorityQueue<Long> A = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A.add((long)Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        if (N == 1)
            System.out.println(0);
        else {
            long sum =0;
            while (A.size() >= 2) {
                long part_sum = A.poll() + A.poll();
                sum += part_sum;
                A.add(part_sum);
            }

            System.out.println(sum); 
        }
    }
}
