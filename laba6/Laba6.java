package laba6;
import java.util.Scanner;
public class Laba6 {

	public static void main(String... args){
		Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
       String convert = Integer.toBinaryString(number);
        //System.out.println(convert);
        //convert = Integer.toOctalString(number);
        //System.out.println(convert);
        convert = Integer.toHexString(number);
        System.out.println(convert);
    }
}
