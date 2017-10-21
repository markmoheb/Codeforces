package ladder12;
import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/61/A
@SuppressWarnings("unused")
public class _61A {

	/*
	 * Mistakes: Didn't pay attention that long was needed The input was too large
	 * for LONG too !!!
	 * 
	 * public static void main(String[] args) throws IOException { BufferedReader br
	 * = new BufferedReader(new InputStreamReader(System.in));
	 * 
	 * String temp = br.readLine();
	 * 
	 * long a = Long.parseLong(temp, 2);
	 * 
	 * temp = br.readLine(); long b = Long.parseLong(temp, 2);
	 * 
	 * long c = a ^ b;
	 * 
	 * String res = Long.toBinaryString(c); while (res.length() < temp.length()) {
	 * res = "0" + res; }
	 * 
	 * System.out.println(res); }
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();
		String c = "";

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				c += "1";
			else
				c += "0";
		}

		System.out.println(c);
	}
}
