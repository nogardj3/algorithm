import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6081 {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            String n_str = st.nextToken();

            int n = Integer.parseInt(n_str, 16);

            System.out.println(n);
            for (int i = 1; i < 16; i++) {
                System.out.println(
                        (n_str + "*" + Integer.toHexString(i) + "=" + Integer.toHexString(n * i))
                                .toUpperCase());
            }
            break;
        }
    }
}


