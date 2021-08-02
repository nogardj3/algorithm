import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class TapeEquilibrium {
    public static void main(String[] args) throws IOException {
        // 단순 공백 기준 여러개 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //===============================================
        int[] A = new int[0];
        //===============================================

        if (A.length == 2) {
            System.out.println(Math.abs(A[0] - A[1]));
            // return Math.abs(A[0] - A[1]);
        }
        else{
            int pre_sum = 0;
            int tail_sum = Arrays.stream(A).sum();

            int min=2001;
            for(int i=0;i<A.length - 1;i++){
                pre_sum += A[i];
                tail_sum -= A[i];
                min = Math.min(Math.abs(
                    pre_sum - tail_sum
                )
                ,min);
            }
            
            System.out.println(min);
            // return min;
        }
    }
}
