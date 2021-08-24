import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class DP {
    static int N;
    static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        solution();
    }

    static void solution() {
        d = new int[N + 1];
        top_down(N);
        bottom_up();
    }

    static int top_down(int number) {
        if (number == 1)
            return 0;
        if (d[number] > 0)
            return d[number];
        d[number] = top_down(number - 1) + 1;
        if (number % 2 == 0) {
            int tmp = top_down(number / 2) + 1;
            if (d[number] > tmp)
                d[number] = tmp;
        }
        if (number % 3 == 0) {
            int tmp = top_down(number / 3) + 1;
            if (d[number] > tmp)
                d[number] = tmp;
        }
        return d[number];
    }
    
    static void bottom_up(){
        int[] A = new int[N+1];

        for (int i = 2; i <= N; i++) {
            A[i] = A[i - 1] + 1;
            if (i % 2 == 0)
                A[i] = Math.min(A[i], A[i / 2] + 1);
            if (i % 3 == 0)
                A[i] = Math.min(A[i], A[i / 3] + 1);
            if (i % 5 == 0)
                A[i] = Math.min(A[i], A[i / 5] + 1);
        }

        System.out.println(A[N]);
    }
}
