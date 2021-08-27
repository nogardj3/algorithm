import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Dominator {
    static int N;
    static int A[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
    
    public static void solution() {
        int res = -1;

        if (A.length == 0) {
            System.out.println(-1);
        }
        if (A.length == 1) {
            System.out.println(0);
        }

        Map<Integer, ArrayList<Integer>> res_map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if(res_map.containsKey(A[i])){
                res_map.get(A[i]).add(i);
            }
            else{
                ArrayList<Integer> aList =  new ArrayList<>();
                res_map.put(A[i], aList);
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> item : res_map.entrySet()) {
            if (item.getValue().size() >= A.length / 2) {
                res = item.getValue().get(0);
                break;
            }
        }
        
        System.out.println(res);
    }
}
