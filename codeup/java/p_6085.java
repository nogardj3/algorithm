import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        float ret = w * h * b / 8 / 1024;
        double t = Math.round(ret / 1024 * 100) / 100.0;
        System.out.println(t + " MB");
    }
}


