package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/112/A
@SuppressWarnings("unused")
public class _112A {
	/*
	 * Another approach: use s1.compareTo(s2); instead of compare function
	 */

	public static int compare(char[] s1, char[] s2) {
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] < s2[i])
				return -1;
			if (s1[i] > s2[i])
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] s1 = br.readLine().toLowerCase().toCharArray();
		char[] s2 = br.readLine().toLowerCase().toCharArray();

		System.out.println(compare(s1, s2));
	}
}
