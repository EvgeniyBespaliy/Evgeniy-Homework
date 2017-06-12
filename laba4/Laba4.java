package laba4;

public class Laba4 {
	public static void main(String[] args) {

		int[][] matrixA;
		matrixA = new int[5][8];
		int a = -99;
	    int b = 199; 
	    int c = -1000;
	    

		for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 8; j++) {
                    	matrixA[i][j] =  a + (int) (Math.random() * b); 	
            	        System.out.print(matrixA[i][j] + "\t");
            	        if (c<matrixA[i][j]){c=matrixA[i][j];}
                    }
                    System.out.println();
                }
		System.out.println("max="+c);
	}
}
