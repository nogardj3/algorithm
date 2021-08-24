import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class GridChallenge {
    static int N;
    static List<String> grid = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            grid.add(st.nextToken());
        }

        solution();
    }
    
    public static String solution() {
        List<String> sortedlList = new ArrayList<>();
        for (String string : grid) {
            char[] charArr = string.toCharArray();
            Arrays.sort(charArr);
            sortedlList.add(new String(charArr));
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
