import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Combination {
    public static void main(String[] args) throws IOException {
		int[] arr = new int[3]; 
		combination(arr, 0, 3, 2, 0);
    }

    public static void combination(int[] arr, int index, int n, int r, int target) {
        if (r == 0)
            print(arr, index);
        else if (target == n)
            return;
        else {
            arr[index] = target;
            combination(arr, index + 1, n, r - 1, target + 1);
            combination(arr, index, n, r, target + 1);
        }
    }

    public static void print(int[] arr, int length) {
		for (int i = 0; i < length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println(""); 
	} 
}
