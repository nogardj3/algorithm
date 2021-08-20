import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TODO 문자열 압축
class p_12_3 {
    public static String N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = st.nextToken();

        solution();
    }

    public static void solution() {
        int numSum = 0;
        ArrayList<Character> strList = new ArrayList<>();
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                strList.add(N.charAt(i));
            } else
                numSum += N.charAt(i) - '0';
        }

        char[] tempCharArray = new char[strList.size()];
        for (int i = 0; i < strList.size(); i++) {
            tempCharArray[i] = strList.get(i);
        }
        Arrays.sort(tempCharArray);
        
        String resString = new String(tempCharArray);
        
        System.out.println(resString + numSum);
    }
}
