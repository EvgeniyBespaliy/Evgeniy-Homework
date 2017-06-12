package laba2;
import java.util.Scanner;
public class Laba2 {
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        double d = b*b-4*a*c;
        if (d<0){System.out.println("Discrimenant menshe noolya");System.exit(0);}
        double x1, x2;
        d = Math.sqrt(d);
        x1=-(b-d)/(2*a);
        x2=-(b+d)/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
