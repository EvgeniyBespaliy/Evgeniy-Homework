package com; 

import java.io.IOException; 
import javax.servlet.http.*; 

@SuppressWarnings("serial") 
public class Laba24Servlet extends HttpServlet { 
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws IOException { 
resp.setContentType("text/html;charset=UTF-8"); 


int a = -99; 
int b = 199; 
int[][] matrixA; 
matrixA = new int[5][8]; 
int max = -100; 
for (int i = 0; i < 5; i++) { 
for (int j = 0; j < 8; j++) { 
int random_number1 = a + (int) (Math.random() * b); 
matrixA[i][j] = random_number1; 
if(matrixA[i][j] > max){ 
max=matrixA[i][j]; 
} 
resp.getWriter().println(matrixA[i][j] + "\t"); 
} 
resp.getWriter().println("<br>"); 
} 
resp.getWriter().println("Максимальный элемент: "+max); 
} 
}