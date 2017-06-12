package laba3;

public class Laba3 {
	public static void main(String[] args) {

		int[][] matrixA;
		matrixA = new int[8][5];
		int a = 10;
	    int b = 89; 
	      
	    

		for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                    	matrixA[i][j] =  a + (int) (Math.random() * b); 	
            	        System.out.print(matrixA[i][j] + "\t");
                    }
                    System.out.println();
                }
	}
}
