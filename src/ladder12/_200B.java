package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/200/B
@SuppressWarnings("unused")
public class _200B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] temp = br.readLine().split(" ");

		int[] drinks = new int[n];
		for (int i = 0; i < drinks.length; i++) {
			drinks[i] = Integer.parseInt(temp[i]);
		}

		int sum = 0;
		for (int i : drinks) {
			sum += i;
		}

		double avg = sum / (1.0 * n);
		System.out.printf("%.12f\n", avg);
	}
}
