import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

class q30 {
    static int N,M;
    static ArrayList<String> A = new ArrayList<>();
    static ArrayList<String> B = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(st.nextToken());
        }

        solution();
    }

    public static void solution() {
        for (String query_str : B) {
            query_str = query_str.replace('?', '.');
            query_str = "^" + query_str + "$";

            int count = 0;
            for (int i = 0; i < N; i++) {
                String target_str = A.get(i);

                if (Pattern.matches(query_str, target_str)) {
                    System.out.println(target_str + "   " + query_str);
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
