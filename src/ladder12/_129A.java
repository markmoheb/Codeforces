package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/129/A
@SuppressWarnings("unused")
public class _129A {

	/*
	 * better approach:
	 * count even and odd bags
	 * cout << (odd % 2 == 1 ? odd : even) << endl;
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int bags = Integer.parseInt(br.readLine());
		String[] temp = br.readLine().split(" ");

		int[] cookies = new int[bags];
		for (int i = 0; i < temp.length; i++) {
			cookies[i] = Integer.parseInt(temp[i]);
		}

		int sum = 0;
		for (int i : cookies) {
			sum += i;
		}

		int count = 0;
		for (int i = 0; i < cookies.length; i++) {
			int rem = sum - cookies[i];
			if (rem % 2 == 0)
				count++;
		}

		System.out.println(count);
	}
}
