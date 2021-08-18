import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class p_10814 {
    static ArrayList<User> A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A.add(new User(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        solution();
    }

    public static void solution() {
        A.sort(new Comparator<User>(){
            @Override
            public int compare(p_10814.User arg0, p_10814.User arg1) {
                if (arg0.age > arg1.age)
                    return 1;
                else if(arg0.age < arg1.age)
                    return -1;
                else 
                    return 0;
            }
            
        });

        for (User user : A) {
            System.out.println(user.age + " " + user.name);
        }
    }
    
    public static class User {
        int age;
        String name;

        public User(int _age, String _name) {
            age = _age;
            name = _name;
        }
    }
}
