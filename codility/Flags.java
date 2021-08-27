import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class Flags {
    static int N;
    static int[] A;

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
        ArrayList<Integer> array = new ArrayList<Integer>();  
        for (int i = 1; i < A.length - 1; i++) {  
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {  
                array.add(i);  
            }  
        }  
        if (array.size() == 1 || array.size() == 0) {
            System.out.println(array.size());
        }  
        int sf = 1;  
        int ef = array.size();  
        int result = 1;  
        while (sf <= ef) {
            int flag = (sf + ef) / 2;
            boolean suc = false;
            int used = 0;
            int mark = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) >= mark) {
                    used++;
                    mark = array.get(i) + flag;
                    if (used == flag) {
                        suc = true;
                        break;
                    }
                }
            }
            if (suc) {
                result = flag;
                sf = flag + 1;
            } else {
                ef = flag - 1;
            }
        }
        
        System.out.println(result);
    }
}
