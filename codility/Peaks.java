import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Peaks {
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
        List<Integer> peaksIndexList = new ArrayList<>();
        
        for(int i=1; i<A.length-1; i++){
            if( A[i-1]<A[i] && A[i]>A[i+1] ){
                peaksIndexList.add(i);
            }
        }

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
                    System.out.println(numBlocks);
                }
            }
        }   
        
        System.out.println(0);
    }
}
