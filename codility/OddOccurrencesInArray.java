import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class OddOccurrencesInArray {
    public static void main(String[] args) throws IOException {
        // 단순 공백 기준 여러개 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        
        Set<Integer> res_set = new HashSet<Integer>();

        if(A.length == 1){
            // return A[0];
            System.out.println(A[0]);
        }
        else{
            for (int i = 0; i < A.length; i++) {
                if(res_set.contains(A[i]))
                    res_set.remove(A[i]);
                else
                    res_set.add(A[i]);
            }

            System.out.println(res_set.iterator().next());
            // return res_map.get(0);
        }
    }
}
