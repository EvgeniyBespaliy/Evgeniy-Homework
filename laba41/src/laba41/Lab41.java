package laba41;

import java.util.Scanner;

public class Lab41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] matrixA;
		matrixA = new int[5][5];
		int a = 0;
	    int b = 100; 	    
	    

		for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                    	matrixA[i][j] =  a + (int) (Math.random() * b); 	
            	        System.out.print(matrixA[i][j] + "\t");
            	        
                    }
                    System.out.println();
                }
		System.out.println("������� ����� ������� �� ������ �����:");
		int c = in.nextInt();
		int d =0;
		int e =0;
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            	if (c==matrixA[i][j]){
            	d=i;
            	e=j;
            	}
                 }
            
        }
		System.out.println("������ ����� ����������� � "+(d+1)+" ������ � "+(e+1)+" �������.");
		System.out.println("������� ��-������: �� � ����, � � ������.");
	}

}
