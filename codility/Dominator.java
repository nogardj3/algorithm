import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Dominator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A));
    }
    
    public static int solution(int[] A) {
        int res = -1;

        if (A.length == 0) {
            return -1;
        }
        if (A.length == 1) {
            return 0;
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
            if(item.getValue().size()>= A.length/2){
                res = item.getValue().get(0);
                break;
            }
        }
        
        return res;
    }
}
