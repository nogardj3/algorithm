import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class BinaryGap {
    public static void main(String[] args) throws IOException {
        // 단순 공백 기준 여러개 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        
        int res = 0;

        String bs = Integer.toBinaryString(N);
        System.out.println(bs);

        for(int i=0;i<bs.length();i++){
            if (bs.charAt(i) == '1') {
                for (int j=i+1; j < bs.length(); j++) {
                    if (bs.charAt(j) == '1') {
                        if (j - i == 1) {
                            i = j - 1;
                            System.out.println("NEAR " + i + " " + j);
                            break;
                        }
                        else {
                            res = Math.max(res, j -i- 1);
                            System.out.println("FIND   "+ i + " " + j);
                            i = j -1;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(res);
    }
}
