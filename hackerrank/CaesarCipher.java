import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        // solution(A);
    }
    
    public static String solution(String s, int k) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (s.charAt(i) + k > 'z') {
                    int a = (s.charAt(i) - 'a' + k) % 26;
                    res.append((char) ('a' + a)) ;
                }
                else
                    res.append((char) (s.charAt(i) + k)) ;
            }
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if (s.charAt(i) + k > 'Z') {
                    int a = (s.charAt(i) - 'A' + k) % 26;
                    res.append((char) ('A' + a)) ;
                }
                else
                res.append((char) (s.charAt(i) + k)) ;
            }
            else
                res.append((char) (s.charAt(i))) ;
        }

        return res.toString();
    }
}
