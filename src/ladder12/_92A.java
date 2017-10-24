package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/361/A
@SuppressWarnings("unused")
public class _92A {
	/*
	 * Another approach: use Gauss law
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		int rem = m;
		int i = 1;
		while (true) {
			int wallrus = i % (n + 1);
			if (rem < wallrus)
				break;
			rem -= wallrus;
			i++;
		}

		System.out.println(rem);
	}
}
