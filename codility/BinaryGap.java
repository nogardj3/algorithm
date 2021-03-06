import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class BinaryGap {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        solution();
    }

    public static void solution(){
        int res = 0;

        String bs = Integer.toBinaryString(N);

        for (int i = 0; i < bs.length(); i++) {
            if (bs.charAt(i) == '1') {
                for (int j = i + 1; j < bs.length(); j++) {
                    if (bs.charAt(j) == '1') {
                        if (j - i != 1) {
                            res = Math.max(res, j - i - 1);
                        }
                        i = j - 1;
                        break;
                    }
                }
            }
        }
        
        System.out.println(res);
    }
}
