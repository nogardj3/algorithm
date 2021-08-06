import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// FAILED

class Peaks {
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
        List<Integer> peaksIndexList = new ArrayList<>();
        
        for(int i=1; i<A.length-1; i++){
            if( A[i-1]<A[i] && A[i]>A[i+1] ){
                peaksIndexList.add(i);
            }
        }
        
        int N = A.length;

        for(int numBlocks =N; numBlocks >=1; numBlocks--){
                    
            if( N % numBlocks ==0){
                int blockSize = N / numBlocks; 
                int ithOkBlock =0;

                for(int peaksIndex : peaksIndexList){
                    if( peaksIndex/blockSize == ithOkBlock){
                        ithOkBlock++; 
                    }
                }   
                
                if(ithOkBlock == numBlocks){
                    return numBlocks;
                }
            }
        }   
        
        return 0;
    }
}
