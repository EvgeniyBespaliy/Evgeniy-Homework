package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Laba23Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		int mass[][] = new int [8][5];
		int a=10, b=89;
		for (int i=0; i<8; i++){
			for (int j=0; j<5; j++){
				mass[i][j]= a + (int) (Math.random() * b);
				resp.getWriter().print( mass[i][j] + "       "+ "  ");
			}
			resp.getWriter().print("<p>");
		}

	}
}