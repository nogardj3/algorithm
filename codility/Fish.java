import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Fish {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A,B));
    }
    
    public static int solution(int[] A, int[] B) {
        if(A.length == 0)
            return 0;

        Stack<Integer> st = new Stack<>(); 
        int numAlive = A.length;
        
        for(int i=0; i<A.length; i++){
            if(B[i] ==1){
                st.push(A[i]);
            }
            if(B[i] ==0){
                while( !st.isEmpty() ){ 
                    if( st.peek() > A[i] ){
                        numAlive--;
                        break;
                    }
                    else if(st.peek() < A[i]){
                        numAlive--;
                        st.pop();
                    }
                }
            }  
        }
        
        return numAlive;
    }
}
