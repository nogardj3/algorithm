import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class p_3_1 {
    public static void main(String[] args) {
        String name;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름을 입력해주세요");
        try {
            name = in.readLine();
            System.out.print("당신의 이름: " + name);
        } catch (IOException e) {
            System.err.println("error!");
        }
        System.out.println(("zzzzzzzz"));
        System.out.println(("11 하하"));
    }
}