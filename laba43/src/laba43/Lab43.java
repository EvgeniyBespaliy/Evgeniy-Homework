package laba43;

import java.util.Scanner;

public class Lab43 {

	public static void main(String[] args) {
		int mass[][] = { { 15, 20, 40, 85, 100 }, { 20, 35, 80, 95, 110 }, { 30, 55, 95, 105, 130 },
				{ 40, 80, 100, 120, 134 }, { 50, 90, 110, 121, 140 } };
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.printf("%4d ", mass[i][j]);
			}
			System.out.println();
		}
		System.out.println("Введите искомое число");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int i = 2;
		int j = 2;
		int n = 4;
		int k = 0;

		if (a < mass[i][j]) {
			while (a < mass[i][j]) {
				
				i--;
				j--;
			}
		} else if (a > mass[i][j]) {
			while (a > mass[i][j]) {
				i++;
				j++;
			}
		}
//		System.out.println(i + " " + j);
		
		
		boolean q = false;
		if (a == mass[i][j]){
			q = true;
			i++;
			j++;
		}
			
		
		int x=i;
		x=x<2?x++:x;
		
		if(q == false){
		for (i = 0; i <= x && q == false; i++) {
			for (j = x; j <= 4 && q == false; j++) {
				if (mass[i][j] == a)
					q = true;
			}
		}}
		if(q == false){
		for (i = x; i <= 4 && q == false; i++) {
			for (j = 0; j <= x && q == false; j++) {
				if (mass[i][j] == a)
					q = true;
			}
		}
		}
	
		System.out.println("Координаты искомого числа: \n Столбец №" +i+ "\n Строка №" +j);
	}

}
