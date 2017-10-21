package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/276/A
@SuppressWarnings("unused")
public class _276A {
	/*
	 * Mistakes: min was -1 while there was a max of -4235433;
	 * It's safer to take min as the first actual value
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		int[][] restaurants = new int[n][2];
		for (int i = 0; i < restaurants.length; i++) {
			temp = br.readLine().split(" ");
			restaurants[i][0] = Integer.parseInt(temp[0]);
			restaurants[i][1] = Integer.parseInt(temp[1]);
		}

		int max = Integer.MIN_VALUE, time = 0;
		for (int i = 0; i < restaurants.length; i++) {
			int candidate_fun = (restaurants[i][1] <= k) ? restaurants[i][0]
					: restaurants[i][0] - (restaurants[i][1] - k);

			max = (candidate_fun > max) ? candidate_fun : max;
		}
		System.out.println(max);
	}
}
