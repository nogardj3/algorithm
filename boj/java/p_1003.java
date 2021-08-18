import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1003 {
    static int N;
    static ArrayList<Sums> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        makeFib(41);
        

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            System.out.println(A.get(num).zero_cnt + " " + A.get(num).one_cnt);
            
        }

        solution();
    }

    public static void solution() {
    }

    public static void makeFib(int last) {
        A = new ArrayList<>();
        A.add(new Sums(1, 0));
        A.add(new Sums(0, 1));

        for (int i = 2; i < last; i++) {
            A.add(new Sums(A.get(i - 2).zero_cnt + A.get(i - 1).zero_cnt,
                    A.get(i - 2).one_cnt + A.get(i - 1).one_cnt));
        }
        
    }
    
    public static class Sums {
        int zero_cnt;
        int one_cnt;

        Sums(int _zero_cnt, int _one_cnt) {
            zero_cnt = _zero_cnt;
            one_cnt = _one_cnt;
        }
    }
}
