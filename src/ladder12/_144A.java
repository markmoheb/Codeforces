package ladder12;
import java.io.*;
import java.util.*;

//	http://codeforces.com/problemset/problem/144/A
@SuppressWarnings("unused")
public class _144A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] temp = br.readLine().split(" ");

		int[] soldiers = new int[n];
		for (int i = 0; i < temp.length; i++) {
			soldiers[i] = Integer.parseInt(temp[i]);
		}

		int max = -1, maxIndex = 0, min = Integer.MAX_VALUE, minIndex = 0;
		for (int i = 0; i < soldiers.length; i++) {
			if (soldiers[i] > max) {
				max = soldiers[i];
				maxIndex = i;
			}

			if (soldiers[i] <= min) {
				min = soldiers[i];
				minIndex = i;
			}

		}

		int modifier = 0;
		if (maxIndex > minIndex)
			modifier = -1;

		System.out.println(maxIndex + (n - 1 - minIndex) + modifier);
	}

}
