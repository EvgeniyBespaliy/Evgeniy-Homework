package laba7;

import java.util.Arrays;
import java.util.Scanner;

public class Laba7 {

	public static void main(String[] str) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите колиство элементов массива");
		int a = in.nextInt();
		String[] m = new String[a + 1];
		System.out.println("Введите строки");
		for (int i = 0; i <= a; i++) {
			String c = in.nextLine();
			m[i] = c;
		}
		System.out.println();
		System.out.println("До сортировки: ");
		for (int i = 0; i <= a; i++) {
			System.out.print(m[i] + " ");
		}
		Arrays.sort(m);
		System.out.println();
		System.out.println("После сортировки: ");
		for (int i = 0; i <= a; i++) {
			System.out.print(m[i] + " ");
		}
	}
}
