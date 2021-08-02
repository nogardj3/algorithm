import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int num = 0;
        int idx = 1;
        for (int i = a;; i += d) {
            num = i;
            if (idx == n)
                break;
            idx++;
        }

        System.out.println(num);
    }
}


