import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_1181 {
    static ArrayList<String> A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A.add(st.nextToken());
        }

        solution();
    }

    public static void solution() {
        A.sort(new Comparator<String>(){
            @Override
            public int compare(String arg0, String arg1) {
                if (arg0.length() > arg1.length())
                    return 1;
                else if(arg0.length() < arg1.length())
                    return -1;
                else {
                    return arg0.compareTo(arg1);
                }
            }
            
        });

        String before = "";
        for (String user : A) {
            if (!before.equals(user)) {
                before = user;
                System.out.println(user);
            }
        }
    }
}
