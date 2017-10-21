package ladder12;
import java.io.*;
import java.util.*;

// http://codeforces.com/problemset/problem/104/A
@SuppressWarnings("unused")
public class _104A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 10;

		int b = n - a;
		int x;

		if ((b < 10 && b > 0) || b == 11)
			x = 4;
		else if (b == 10)
			x = 4 * 4 - 1;
		else
			x = 0;

		System.out.println(x);
	}
}
