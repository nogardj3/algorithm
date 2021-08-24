import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class RecursiveDigitSum {
    static String n;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = st.nextToken();
        k = Integer.parseInt(st.nextToken());

        solution();
    }
    
    public static int solution() {
        char[] carray = n.toCharArray();

        long sum = 0;
        for (char c : carray) {
            sum += (int) (c - '0');
        }
        sum *= k;
        System.out.println(sum);

        while (sum > 10) {
            long temp_sum = 0;
            while (sum != 0) {
                temp_sum += sum % 10;
                sum /= 10;
            }

            System.out.println(temp_sum);
            sum = temp_sum;
        }
        
        return (int) sum;
    }
}
