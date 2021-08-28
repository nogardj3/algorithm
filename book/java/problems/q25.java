import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class q25 {
    static int N, M;
    static int[] stages;
    static ArrayList<Item> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        stages = new int[M+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            stages[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }

    public static void solution() {
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int byebye = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i)
                    sum += 1;
                if (stages[j] == i)
                byebye += 1;
            }
            
            A.add(new Item(i, (float) byebye / (float) sum));
        }
        
        Collections.sort(A);

        for (Item item : A) {
            System.out.println(item.idx + "  " + item.percent);
        }
    }
    
    public static class Item implements Comparable<Item> {
        private int idx;
        private float percent;
    
        public Item(int _idx, float _percent) {
            idx = _idx;
            percent = _percent;
        }
    
        @Override
        public int compareTo(Item right) {
            if (percent == right.percent) {
                return idx - right.idx;
            }
            return (right.percent - percent) >0 ? 1 : -1;
        }
    }
}
