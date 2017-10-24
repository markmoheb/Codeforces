package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/361/A
@SuppressWarnings("unused")
public class _361A {
	public static void swap(int[] arr, int a, int b) {
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}

	public static void shift(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			swap(arr, i, i - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		int[][] table = new int[n][n];
		for (int i = 0; i < table.length; i++) {
			table[i][i] = k;
		}

		for (int i = 0; i < table.length; i++) {
			String row = "";
			for (int j = 0; j < table.length; j++) {
				row += table[i][j] + " ";
			}
			row.trim();
			System.out.println(row);
		}
	}
}
