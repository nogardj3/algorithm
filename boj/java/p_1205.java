import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1205 {
    static int N, newScore, P;
    static ArrayList<Integer> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        newScore = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println(1);
        }
        else {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A.add(Integer.parseInt(st.nextToken()));
            }
    
            solution();
        }
    }
    
    static void solution() {
        if(N==P && newScore<= A.get(A.size()-1))
            System.out.println(-1);
        else {
            int ranking = 1;
            for (Integer score : A) {
                if (score > newScore) {
                    ranking++;
                } else if (score <= newScore) {
                    break;
                }
            }
            System.out.println(ranking > P ? -1:ranking);
        }
    }
}
