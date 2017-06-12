package laba31;

import java.util.Scanner;

public class Lab31 {

	public static void main(String[] args) {
		String stih = new String(
				"Жила-была коза с козлятами. Уходила коза в лес есть траву \n шелковую, пить воду студёную. Как только уйдет — козлятки запрут избушку и \n сами никуда не выходят. Воротится коза, постучится в дверь и запоёт: — \n Козлятки, ребятушки! Отопритеся, отворитеся! Ваша мать пришла — молока \n принесла; Бежит молоко по вымечку, Из вымечку по копытечку, Из копытечку \n во сыру землю! Козлятки отопрут дверь и впустят мать. Она их покормит, \n напоит и опять уйдет в лес, козлятки запрутся крепко-накрепко. Волк \n подслушал, как поёт коза. Вот раз коза ушла, волк побежал к избушке и \n закричал толстым голосом: — Вы, детушки! Вы, козлятки! Отопритеся, \n Отворитеся! Ваша мать пришла, Молока принесла. Полны копытца водицы!");
		String result = stih.replaceAll("([,!;:.-])" , "");
		Scanner in = new Scanner(System.in);
		String mass[][] = new String[20][20];
		int a = 0;
		int b = 0;
		String q;

		for (String retval : result.split(" ")) {
			boolean c = retval.contentEquals("\n");
			if (c == true) {
				b++;
				a = 0;
				System.out.println();
			} else {
				
				System.out.print(mass[b][a] = retval + " ");
				a++;
			}

		}
		System.out.println();
		String arr[] = new String[130];
		int podarr[] = new int[130];
		boolean c, fl;
		int sum = 1;
		for (a = 0; a < 20; a++) {
			for (b = 0; b < 20; b++) {
				if (mass[a][b] != null) {
					fl = false;
					for (int g = 0; g < 130 && fl == false; g++) {
						if (arr[g] != null) {
							c = arr[g].equalsIgnoreCase(mass[a][b]);
							if (c == true) {
								podarr[g]++;
								fl = true;
							}
						}
					}
					if (fl==false){
						arr[sum]=mass[a][b];
						podarr[sum]=1;
					sum++;
						
						
					}
					
				}
			}

		}
		for (int g = 0; g < 130; g++) {
			if (arr[g] != null){
			arr[g] = arr[g] +" : "+ String.valueOf(podarr[g]);
			System.out.println(arr[g]);
			}
		}
	}
}
