package _876;

import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/876/C
@SuppressWarnings("unused")
public class C {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> res = new ArrayList<>();
		for (int sumOfDigits = 1; sumOfDigits <= 100; sumOfDigits++) {
			int x = n - sumOfDigits;
			if (x >= 1 && sumOfDigits(x) == sumOfDigits) {
				res.add(x);
			}
		}
		// System.out.println(res);
		System.out.println(res.size());

		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(res.size() - i - 1));
		}
	}

	static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}
}