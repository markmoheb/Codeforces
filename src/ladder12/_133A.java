package ladder12;
import java.io.*;
import java.util.*;

//http://codeforces.com/problemset/problem/133/A
@SuppressWarnings("unused")
public class _133A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp = br.readLine();
		
		if (temp.matches(".*[HQ9].*"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
