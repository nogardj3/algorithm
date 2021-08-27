import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Sort {
    public static void main(String[] args) throws IOException {
        ArrayList<Item> aList = new ArrayList<>();

        aList.add(new Item("aa", 10, 20));
        aList.add(new Item("bb", 10, 30));
        aList.add(new Item("bb", 20, 30));
        aList.add(new Item("Bb", 20, 30));

        Collections.sort(aList);

        for (Item item : aList) {
            System.out.println(item.value1 +"  " +item.value2 +"  " + item.mText);
        }
    }

    static class Item implements Comparable<Item> {
        private String mText;
        private int value1;
        private int value2;

    
        public Item(String text, int _v1, int _v2) {
            mText = text;
            value1 = _v1;
            value2 = _v2;
        }
    
        @Override
        public int compareTo(Item right) {
            if (value1 > right.value1)
                return -1;
            else {
                if(value2> right.value2)
                    return 1;
                else {
                    return mText.compareTo(right.mText);
                }
            }
        }
    }
}
