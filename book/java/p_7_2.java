import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_7_2 {
    static int N,M;
    static ArrayList<Integer> A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        B = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        Collections.sort(A);
        for (Integer integer : B) {
            System.out.print(findNum(integer,0,A.size()-1) ? "yes " : "no ");
        }
    }

    public static boolean findNum(int target, int start, int end) {
        int mid = (start + end) / 2;
        if (start >= end) {
            return false;
        }
        else if(target == A.get(start)   || target == A.get(end) ||  target == A.get(mid))
            return true;
        else if (target > A.get(mid)) {
            return findNum(target, mid + 1, end);
        }
        else if(target < A.get(mid)){
            return findNum(target, start, mid -1);
        }
        else{
            return false;
        }
    }
}
