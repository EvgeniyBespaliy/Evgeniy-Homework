package com; 

import java.io.IOException; 
import javax.servlet.http.*; 

@SuppressWarnings("serial") 
public class Laba22Servlet extends HttpServlet { 
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws IOException { 
resp.setContentType("text/html;charset=UTF-8"); 

String var1 = req.getParameter("var1"); 
int i1 = Integer.parseInt(var1); 

String var2 = req.getParameter("var2"); 
int i2 = Integer.parseInt(var2); 

String var3 = req.getParameter("var3"); 
int i3 = Integer.parseInt(var3); 
int a = i1; 
int b = i2; 
int c = i3; 
double d; 
d = b * b - 4 * a * c; 
double x1, x2; 
if (d > 0) { 
x1 = (-b - Math.sqrt(d)) / (2 * a); 
x2 = (-b + Math.sqrt(d)) / (2 * a); 
if (x1 == x2) { 
resp.getWriter().println("<br>");
resp.getWriter().println(x1); 
} else { 
resp.getWriter().println("<br>");
resp.getWriter().println(x1); 
resp.getWriter().println("<br>"); 
resp.getWriter().println(x2); 
} 
} else { 
resp.getWriter().println("Корней нет"); 
} 
} 
}
