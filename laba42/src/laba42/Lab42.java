package laba42;

import java.util.Scanner;

public class Lab42 {

	public static void main(String[] args) {
		String stih = new String(
				"Там, где нас нет - горит невиданный рассвет. \n Где нас нет - море и рубиновый закат. \n Где нас нет - лес, как малахитовый браслет. \n Где нас нет? На Лебединых островах! \n Где нас нет! Услышь меня и вытащи из омута. \n Веди в мой вымышленный город, вымощенный золотом. \n Во сне я вижу дали иноземные, \n Где милосердие правит, где берега кисельные. ");
		Scanner in = new Scanner(System.in);
		String mass[][] = new String[10][10];
		int a = 0;
		int b = 0;
		String q;

		for (String retval : stih.split(" ")) {
			boolean c = retval.contentEquals("\n");
			if (c == true) {
				b++;
				a = 0;
				System.out.println();
			} else {
				
				System.out.printf("%10s", mass[b][a] = retval + "\t");
				a++;
			}

		}

		System.out.println("\n Введите искомое значение");
		q = in.next();
		System.out.println("Координаты этого слова");
		int s = 0;

		for (a = 0; a < 10; a++) {
			for (b = 0; b < 10; b++) {
				if (mass[a][b]!=null){
				s = mass[a][b].indexOf(q);
				if (s != -1) {
					System.out.println("Строчка №"+(a+1) + " Столбец №" + (b+1));	
				}
				}
			}
		}
		
	}
}
