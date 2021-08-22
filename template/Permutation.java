import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Permutation {
    static int N,M;
    static ArrayList<Integer> A = new ArrayList<>(), B = new ArrayList<>();

    public static void main(String[] args) throws IOException {
		int[] arr = {1, 2, 3};
		int n = arr.length;
		int[] output = new int[n];
		boolean[] visited = new boolean[n];

		per2(arr, output, visited, 0, n, 3);
    }

    static void per2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                per2(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
    
	static void print(int[] arr, int r) {
		for(int i = 0; i < r; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
