import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TimeConversion {
    static String s;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        s = st.nextToken();

        solution();
    }
    
    public static void solution() {
        int pre = Integer.valueOf(s.substring(0, 2));
        if (s.contains("PM")) {
            if (pre == 12) {
                s = s.substring(0, 8);
            }
            else {
                pre += 12;
                s = pre + s.substring(2,8);
            }
        }
        else if (s.contains("AM")) {
            if (pre == 12) {
                s = "00" + s.substring(2, 8);
            }
            else {
                s = s.substring(0, 8);
            }
        }

        System.out.println(pre + s.substring(2,8));
    }
}
