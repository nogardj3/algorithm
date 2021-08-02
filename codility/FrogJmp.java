import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class FrogJmp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        System.out.println(solution(X, Y, D));
    }
    
    public static int solution(int X, int Y, int D){
        if (X == Y) {
            return 0;
        } else {
            int res = (Y - X) / D;
            if ((Y - X) % D != 0)
                res += 1;

            return res;
        }
    }
}
