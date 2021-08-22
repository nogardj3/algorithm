import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q23 {
    static int N;
    static ArrayList<Item> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            A.add(new Item(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }

        solution();
    }

    public static void solution() {
        Collections.sort(A);
        System.out.println();
        
        for (Item item : A) {
            System.out.println(item.mText);
        }
    }
    
    public static class Item implements Comparable<Item> {
        private String mText;
        private int value1;
        private int value2;
        private int value3;

    
        public Item(String text, int _v1, int _v2, int _v3) {
            mText = text;
            value1 = _v1;
            value2 = _v2;
            value3 = _v3;
        }
    
        @Override
        public int compareTo(Item right) {
            if (value1 == right.value1) {
                if (value2 == right.value2) {
                    if (value3 == right.value3)
                        return mText.compareTo(right.mText);
                    return right.value3 - value3;
                }
                return value2 - right.value2;
            }
            return  right.value1 - value1;
        }
    }
}
