import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class GridChallenge {
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
    
    public static String solution(List<String> grid) {
        List<String> sortedlList = new ArrayList<>();
        for (String string : grid) {
            char[] charArr = string.toCharArray();
            Arrays.sort(charArr);
            sortedlList.add(new String(charArr));
        }

        for (String string : sortedlList) {
            System.out.println(string);
        }

        boolean is_asc = true;
        for (int i = 0; i < sortedlList.get(0).length(); i++) {
            is_asc = true;
            for (int j = 1; j < sortedlList.size(); j++) {
                if (sortedlList.get(j - 1).charAt(i) > sortedlList.get(j).charAt(i)) {
                    is_asc = false;
                    break;
                }
            }
            if(!is_asc)
                break;
        }
        
        return is_asc ? "YES" : "NO";
    }
}
