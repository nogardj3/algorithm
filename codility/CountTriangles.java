import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class CountTriangles {
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
        // System.out.println(Arrays.toString(solution(N,P,Q)));
    }
    
    public static int solution(int[] A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        pick(A.length, new ArrayList<Integer>(), 3, result);

        int count = 0;
        for (ArrayList<Integer> arrayList : result) {
            if( A[arrayList.get(0)] < A[arrayList.get(1)] + A[arrayList.get(2)] &&
                A[arrayList.get(1)] < A[arrayList.get(0)] + A[arrayList.get(2)] &&
                A[arrayList.get(2)] < A[arrayList.get(0)] + A[arrayList.get(1)]) {
                count++;
            }
        }

        return count;
    }

    private static void pick(int n, ArrayList<Integer> picked, int toPick, ArrayList<ArrayList<Integer>> collection) {
        if (toPick == 0) {
            //System.out.println(picked);
            collection.add(picked);
            return;
        }

        int smallest = picked.isEmpty() ? 0 : picked.get(picked.size() - 1) + 1;

        for (int next = smallest; next < n; next++) {
            picked.add(next);
            pick(n, new ArrayList<Integer>(picked), toPick - 1, collection);
            picked.remove(picked.size() - 1);
        }
    }
}
