package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/266/A
@SuppressWarnings("unused")
public class _266A {
	/*
	 * Another approach: remove neighbors and count new n- length
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(br.readLine());

		for (int i = 0; i < sb.length() - 1; i++)
			if (sb.charAt(i) == sb.charAt(i + 1))
				sb.deleteCharAt(i--);

		System.out.println(n - sb.length());
	}
}
