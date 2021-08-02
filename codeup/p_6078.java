import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6078 {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            System.out.println(str);

            if (str.equals("q"))
                break;
        }
    }
}
