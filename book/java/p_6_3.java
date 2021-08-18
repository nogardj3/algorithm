import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_6_3 {
    static int N;
    static ArrayList<User> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A.add(new User( st.nextToken(),Integer.parseInt(st.nextToken())));
        }

        solution();
    }

    public static void solution() {
        Collections.sort(A,new Comparator<User>(){
            @Override
            public int compare(User arg0, User arg1) {
                if (arg0.num > arg1.num) {
                    return 1;
                }
                else if (arg0.num < arg1.num) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

        for (User user : A) {
            System.out.print(user.name + " ");
        }
    }
    
    public static class User {
        String name;
        int num;

        public User(String _name, int _num){
            name = _name;
            num = _num;
        }
    }
}
