package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/112/A
@SuppressWarnings("unused")
public class _334A {
	/*
	 * Another approach: is to compute each row using the closed form of the
	 * sequence n * j + (i + j) % n + 1
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] bags = new int[n][n];

		int currBag = 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag) {
				for (int j = 0; j < n; j++) {
					bags[j][i] = currBag++;
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					bags[j][i] = currBag++;
				}
			}
			flag = !flag;
		}

		for (int i = 0; i < bags.length; i++) {
			for (int j = 0; j < bags[i].length; j++) {
				System.out.print(bags[i][j]);
				if (j < bags[i].length - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
