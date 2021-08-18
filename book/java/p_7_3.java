import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_7_3 {
    static int N,M, last_height;
    static ArrayList<Integer> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        Collections.sort(A);
        System.out.println(findNum(0,A.get(A.size()-1)));
    }

    public static int findNum(int start, int end) {
        if (start >= end) {
            return end;
        }

        int sum = 0;
        int mid = (start + end) / 2;
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i) > start)
                sum += (A.get(i) - mid);
        }

        if (sum >= M) {
            return findNum(mid + 1, end);
        }
        else {
            return findNum(start, mid - 1);
        }
    }
}
