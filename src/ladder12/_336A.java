package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/336/A
@SuppressWarnings("unused")
public class _336A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp[] = br.readLine().split(" ");
		int x = Integer.parseInt(temp[0]);
		int y = Integer.parseInt(temp[1]);

		if (x > 0 && y >= 0) // 1ST QUAD
		{
			int[] p1 = { 0, x + y };
			int[] p2 = { x + y, 0 };
			System.out.printf("%d %d %d %d", p1[0], p1[1], p2[0], p2[1]);
		} else if (x < 0 && y >= 0) // 2ND QUAD
		{
			int[] p1 = { x - y, 0 };
			int[] p2 = { 0, y - x };
			System.out.printf("%d %d %d %d", p1[0], p1[1], p2[0], p2[1]);
		} else if (x < 0 && y < 0) // 3RD QUAD
		{
			int[] p1 = { x + y, 0 };
			int[] p2 = { 0, x + y };
			System.out.printf("%d %d %d %d", p1[0], p1[1], p2[0], p2[1]);
		} else if (x >= 0 && y < 0) // 4TH QUAD
		{
			int[] p1 = { 0, y - x };
			int[] p2 = { x - y, 0 };
			System.out.printf("%d %d %d %d", p1[0], p1[1], p2[0], p2[1]);
		}

	}
}
