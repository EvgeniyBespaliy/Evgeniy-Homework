package laba5;

import java.util.Scanner;

public class Laba5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short a = in.nextShort();
		short b = in.nextShort();
		String s = "";
		int i;
		for (i = a; i <= b; i++) {
			s = s + (char) i;
		}
		System.out.println(s);
	}
}
