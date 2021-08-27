import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class FrogJmp {
    static int X, Y, D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        solution();
    }
    
    public static void solution(){
        if (X == Y) {
            System.out.println(0);
        } else {
            int res = (Y - X) / D;
            if ((Y - X) % D != 0)
                res += 1;

            System.out.println(res);
        }
    }
}
