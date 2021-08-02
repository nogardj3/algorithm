import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6077 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());

        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};
        for (int i = 0; i < coinTypes.length; i++) {
            count += N / coinTypes[i];
            N %= coinTypes[i];
        }

        System.out.println(count);
    }
}
