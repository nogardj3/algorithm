import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class EquiLeader {
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
        int res = 0;
        int most_val = 0;

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
                most_val = item.getKey();
                break;
            }
        }

        Vector<Integer> record = new Vector<Integer>(); int currentCount = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == most_val) {
                ++currentCount;
            }
            record.add(currentCount);
        }

        for (int i = 0; i < A.length - 1; ++i) {
            int LeftCount = record.elementAt(i);
            int RightCount = record.lastElement() - LeftCount;
            int limitEquiLeft = ((i + 1) / 2) + 1;
            int limitEquiRight = ((A.length - (i + 1)) / 2) + 1;
            if ((LeftCount >= limitEquiLeft) && (RightCount >= limitEquiRight)) 
            {
                ++res;
            }
        }
        return res;
    }
}
