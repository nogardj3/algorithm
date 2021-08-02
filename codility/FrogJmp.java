import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class FrogJmp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S;
        int[] P;
        int[] Q;

        if (X == Y) {
            System.out.println(0);
            // return 0;
        }
        else{
            int res = (Y - X) / D;
            if((Y - X) % D != 0)
                res += 1;
                
            System.out.println(res);
            // return res;
        }
    }
}
