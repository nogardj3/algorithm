import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

// Frequently Used Methods

class fum {
    public static void main(String[] args) throws IOException {
        // ---------- Arrays ----------
        int[] intArray = new int[3];
        Arrays.fill(intArray, -1); // 해당 값으로 채우기

        // ---------- Collections ----------
        ArrayList<Integer> intArrayList = new ArrayList<>();
        // * Common
        Collections.sort(intArrayList); // 정렬 - 오름차순
        Collections.sort(intArrayList, Collections.reverseOrder()); // 정렬 - 내림차순
        // * ArrayList
        Integer[] fromList = intArrayList.toArray(new Integer[] { 0 }); // 형 변환
        // * Priority Queue
        PriorityQueue<Integer> pqAsc = new PriorityQueue<>(); // 우선순위가 낮은 숫자 순
        PriorityQueue<Integer> pqDesc = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 높은 숫자 순
        // * 리스트 합치기
        ArrayList<Integer> fooList = new ArrayList<>();
        ArrayList<Integer> fooList2 = new ArrayList<>();
        fooList.addAll(fooList2);

        // ---------- String ----------
        // * 형식 변환
        String binaryStr = Integer.toBinaryString(10);
        String octalString = Integer.toOctalString(10);
        String hexString = Integer.toHexString(10);
        System.out.printf("%s %s %s %n", octalString, binaryStr, hexString);

        StringBuilder stringBuilder = new StringBuilder("String");
        stringBuilder.append("append"); // 붙이기
        stringBuilder.insert(3, "inserted "); // 끼워넣기
        stringBuilder.reverse(); // 뒤집기
        stringBuilder.substring(0, 2); // 자르기 (시작값부터 끝값 -1 까지)
        System.out.printf("%s %n", stringBuilder.toString());

        // ---------- Regular Expresssion ----------

        // ---------- Calendar ----------
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        // * 입력
        calendar.set(2021, 8, 3, 19, 27, 33);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.setTimeInMillis(100000);
        // * 비교
        calendar.compareTo(calendar2);
        long timeDiff = calendar.getTimeInMillis() - calendar.getTimeInMillis();
        long sec = timeDiff / 1000;
        long min = timeDiff / (60 * 1000);
        long hour = timeDiff / (60 * 60 * 1000);
        long day = timeDiff / (24 * 60 * 60 * 1000);
        System.out.printf("%d %d %d %d %n", sec, min, hour, day);
        // * 출력
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY_MM_DD/HH:MM:SS");
        System.out.printf("%s %n", dateFormat.format(calendar.getTime()));

        // ---------- 출력 ---------- 
        System.out.printf("%o %d %x %.2f %c %s %n", 0, 10, 10, 0.3f, 36, "string");
        int[] fooArray = new int[3];
        printArray(fooArray);
        int[][] fooArray2D = new int[3][3];
        printArray2D(fooArray2D); // 1차원 arraylist 출력
        System.out.println(intArrayList.toString()); // 1차원 arraylist 출력
        ArrayList<ArrayList<Integer>> fooArrayList2D = new ArrayList<>();
        printArrayList2D(fooArrayList2D); // 1차원 arraylist 출력
    }
    
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
    
    static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i]);
            }
            System.out.println();
        }
    }
    
    static void printArrayList2D(ArrayList<ArrayList<Integer>> arrayList2D) {
        for (ArrayList<Integer> arrayList : arrayList2D) {
            System.out.println(arrayList.toString());
        }
    }
}
