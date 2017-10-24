package ladder12;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/330/A
@SuppressWarnings("unused")
public class _330A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");
		int r = Integer.parseInt(temp[0]);
		int c = Integer.parseInt(temp[1]);

		char cake[][] = new char[r][c];

		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> col = new ArrayList<>();

		for (int i = 0; i < r; i++) {
			cake[i] = br.readLine().toCharArray();
			for (int j = 0; j < c; j++) {
				if (cake[i][j] == 'S') {
					row.add(i);
					col.add(j);
				}
			}
		}

		int eat = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (cake[i][j] != 'S' && !(row.contains(i) && col.contains(j))) {
					eat++;
				}
			}
		}

		System.out.println(eat);
	}
}
