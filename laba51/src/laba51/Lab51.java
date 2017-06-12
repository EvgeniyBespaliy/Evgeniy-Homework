package laba51;

import model.Boxer;
import model.Karatist;
import model.Sumo;
import model.Kickboxer;
import model.Sensay;
import java.util.Scanner;

public class Lab51 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Добро пожаловать на GoFight-2K17");
		System.out.println();
		System.out.println("Выберите класс первого бойца:");
		System.out.println("1 - Боксер");
		System.out.println("2 - Кикбоксер");
		System.out.println("3 - Каратист");
		System.out.println("4 - Сумоист");
		System.out.println("5 - Сэнсей");
		
		int c=in.nextInt();

		int ftr1hlth;
		int ftr2hlth;
		int ftr1strk;
		int ftr2strk;
		String ftr1cl;
		String ftr2cl;
		
		switch (c){
		case 1: Boxer ftr1= new Boxer(); ftr1hlth=ftr1.stamina(0); ftr1strk=ftr1.strike(0); ftr1cl=ftr1.cls(null); break;
		case 2: Kickboxer ftr2= new Kickboxer(); ftr1hlth=ftr2.stamina(0); ftr1strk=ftr2.strike(0); ftr1cl=ftr2.cls(null); break;
		case 3: Karatist ftr3= new Karatist(); ftr1hlth=ftr3.stamina(0); ftr1strk=ftr3.strike(0); ftr1cl=ftr3.cls(null); break;
		case 4: Sumo ftr4= new Sumo(); ftr1hlth=ftr4.stamina(0); ftr1strk=ftr4.strike(0); ftr1cl=ftr4.cls(null); break;
		case 5: Sensay ftr5= new Sensay(); ftr1hlth=ftr5.stamina(0); ftr1strk=ftr5.strike(0); ftr1cl=ftr5.cls(null); break;
		default: Boxer ftr6= new Boxer(); c=0; ftr1hlth=ftr6.stamina(0); ftr1strk=ftr6.strike(0); ftr1cl=ftr6.cls(null);break;
		}
		
		System.out.println("Выберите класс второго бойца:");
		System.out.println("1 - Боксер");
		System.out.println("2 - Кикбоксер");
		System.out.println("3 - Каратист");
		System.out.println("4 - Сумоист");
		System.out.println("5 - Сэнсей");
		
		int b=in.nextInt();
		
		switch (b){
		case 1: Boxer ftr7= new Boxer(); ftr2hlth=ftr7.stamina(0); ftr2strk=ftr7.strike(0); ftr2cl=ftr7.cls(null); break;
		case 2: Kickboxer ftr8= new Kickboxer(); ftr2hlth=ftr8.stamina(0); ftr2strk=ftr8.strike(0); ftr2cl=ftr8.cls(null); break;
		case 3: Karatist ftr9= new Karatist(); ftr2hlth=ftr9.stamina(0); ftr2strk=ftr9.strike(0); ftr2cl=ftr9.cls(null); break;
		case 4: Sumo ftr10= new Sumo(); ftr2hlth=ftr10.stamina(0); ftr2strk=ftr10.strike(0); ftr2cl=ftr10.cls(null); break;
		case 5: Sensay ftr11= new Sensay(); ftr2hlth=ftr11.stamina(0); ftr2strk=ftr11.strike(0); ftr2cl=ftr11.cls(null); break;
		default: Boxer ftr12= new Boxer(); b=0; ftr2hlth=ftr12.stamina(0); ftr2strk=ftr12.strike(0); ftr2cl=ftr12.cls(null); break;
		}
	
		System.out.println(ftr1cl+":");
		System.out.println("Удар:"+ftr1strk+" урона");
		System.out.println("Здоровье:"+ftr1hlth+" очков");
		System.out.println();
		System.out.println(ftr2cl+":");
		System.out.println("Удар:"+ftr2strk+" урона");
		System.out.println("Здоровье:"+ftr2hlth+" очков");
		System.out.println();
		
		int i=0;
		double ftr1itg=100;
		double ftr2itg=100;
		
		do {i++;
		System.out.println("Раунд "+i+":");
		ftr2hlth=(int) (ftr2hlth-ftr1strk*Math.random());
		ftr1hlth=(int) (ftr1hlth-ftr2strk*Math.random());
		if (ftr1hlth<=0) {ftr1hlth=0; ftr1itg=101;}
		if (ftr2hlth<=0) {ftr2hlth=0; ftr2itg=101;}
		System.out.println(ftr1cl+": "+ftr1hlth+" очков здоровья");
		System.out.println(ftr2cl+": "+ftr2hlth+" очков здоровья");	
		System.out.println();
		} while((ftr1hlth>0)&(ftr2hlth>0));
		
		
		if (ftr1itg!=ftr2itg){
			
			if (ftr1itg<ftr2itg){
				System.out.println(ftr1cl+" - победил");
			}
			else {
				System.out.println(ftr2cl+" - победил");
			}
		}
		else {
			System.out.println("Ничья");
		}
	}
}
