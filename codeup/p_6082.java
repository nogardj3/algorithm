import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String ret = "";
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 3 | i % 10 == 6 | i % 10 == 9)
                ret = ret + "X ";
            else
                ret = ret + i + " ";
        }

        System.out.println(ret);
    }
}


