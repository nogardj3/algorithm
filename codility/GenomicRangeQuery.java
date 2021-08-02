import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class PermCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());


        int[] res_arr = new int[P.length];

        Map<Character,Integer> val_map = new HashMap<>();
        val_map.put('A',1);
        val_map.put('C',2);
        val_map.put('G',3);
        val_map.put('T',4);

        for(int j=0;j<P.length;j++){
            int min = 5;
            if(P[j] == Q[j])
                min = Math.min(min,val_map.get(S.charAt(P[j])));
            else{
            for(int i=P[j];i<Q[j];i++){
                min = Math.min(min,val_map.get(S.charAt(i)));
            }
            }
            res_arr[j] = min;
        }

        // return res_arr;
    }
}
