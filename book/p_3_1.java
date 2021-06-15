import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class p_3_1 {
    public static void main(String[] args) throws IOException {
        int N = 0;
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            N = Integer.valueOf(in.readLine());
        } catch (IOException e) {
            System.err.println("error!");
        }
        for (int i = 0; i < coinTypes.length; i++) {
            count += N / coinTypes[i];
            N %= coinTypes[i];
        }

        System.out.println(count);
    }
}


Arrays.sort(arr, new Comparator<T>(){
    @override
    public int compare(String a, String b){
    
	 }})