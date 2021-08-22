import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q28 {
    static int N;
    static ArrayList<Integer> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        findNum(0,A.size()-1);
    }

    public static void findNum(int start, int end) {
        if (start >= end) {
            System.out.println(-1);
            return;
        }
        else if(A.get(start) == start){
            System.out.println(start);
            return;
        }
        else if(A.get(end) == end){
            System.out.println(end);
            return;
        }
        
        int mid = (start + end) / 2;
        if(A.get(mid) == mid){
            System.out.println(mid);
            return;
        }
        else if (A.get(mid) > mid) {
            findNum(start, mid -1);
        }
        else if(A.get(mid)< mid){
            findNum(mid +1, end);
        }
    }
}
