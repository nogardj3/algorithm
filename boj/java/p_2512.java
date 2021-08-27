import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_2512 {
    static int N,M;
    static ArrayList<Integer> A;
    static int sum = 0,  max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            A.add(num);
            
            sum += num;
            max = Math.max(max, num);
        }
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        solution();
    }

    public static void solution() {
        if (sum < M)
            System.out.println(max);
        else
            findMax(1, max);
    }

    static void findMax(long start, long end) {
        long mid =  (start + end) / 2;

        if (start > end || mid == 0) {
            System.out.println(end);
            return;
        }

        long sum = getSum(mid);
        if (sum > M) {
            findMax(start, (int) mid - 1);
        }
        else{
            findMax((int) mid + 1, end);
        }
    }

    static long getSum(long mid) {
        long sum = 0;
        for (Integer integer : A) {
            sum += Math.min(integer,mid);
        }
        return sum;
    }
}
