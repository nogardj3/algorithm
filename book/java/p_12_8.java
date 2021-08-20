import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TODO 외벽 점검
class p_12_8 {
    public static int N, M;
    public static ArrayList<Integer> week,dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        
        week = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            week.add(Integer.parseInt(st.nextToken()));
        }

        dist = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            dist.add(Integer.parseInt(st.nextToken()));
        }


        solution();
    }

    public static void solution() {
        for (int i = 0; i < 4; i++) {
            turnArray();
            if (checkArray()) {
                System.out.println("true");
                break;
            }
        }
    }
    
    static void turnArray() {

    }

    static boolean checkArray() {
        boolean res = true;

        return res;
    }
}
