package laba1;
import java.util.Scanner;
public class Laba1 {
	 public static void main(String[] args) {
		 double a,b,c,d,e;
			Scanner in = new Scanner(System.in); 
			 a = in.nextDouble();
			 b = in.nextDouble();
			c = 10;
			d = Math.abs(a-c);
			e = Math.abs(b-c);
			if (d>e) {System.out.println(b);} else {System.out.println(a);}
	    }
	 
}
