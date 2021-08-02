import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[24];
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        String str = "";
        for (int i = 1; i < arr.length; i++) {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }
}


