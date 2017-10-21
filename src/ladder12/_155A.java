package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/155/A
@SuppressWarnings("unused")
public class _155A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String temp[] = br.readLine().split(" ");
		int[] scores = new int[n];

		for (int i = 0; i < temp.length; i++) {
			scores[i] = Integer.parseInt(temp[i]);
		}

		int max = scores[0], min = scores[0], amazing = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
				amazing++;
			}
			if (scores[i] > max) {
				max = scores[i];
				amazing++;
			}
		}

		System.out.println(amazing);

	}
}
