package com; 

import java.io.IOException; 

import javax.servlet.http.*; 

import model.Boxer;
import model.Karatist;
import model.Kickboxer;
import model.Sensay;
import model.Sumo;

@SuppressWarnings("serial") 
public class Laba52Servlet extends HttpServlet { 
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws IOException { 

resp.setContentType("text/html;charset=UTF-8"); 
String var1 = req.getParameter("var1"); 
int i1 = Integer.parseInt(var1); 

String var2 = req.getParameter("var2"); 
int i2 = Integer.parseInt(var2); 

int c=i1;

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

int b=i2;

switch (b){
case 1: Boxer ftr7= new Boxer(); ftr2hlth=ftr7.stamina(0); ftr2strk=ftr7.strike(0); ftr2cl=ftr7.cls(null); break;
case 2: Kickboxer ftr8= new Kickboxer(); ftr2hlth=ftr8.stamina(0); ftr2strk=ftr8.strike(0); ftr2cl=ftr8.cls(null); break;
case 3: Karatist ftr9= new Karatist(); ftr2hlth=ftr9.stamina(0); ftr2strk=ftr9.strike(0); ftr2cl=ftr9.cls(null); break;
case 4: Sumo ftr10= new Sumo(); ftr2hlth=ftr10.stamina(0); ftr2strk=ftr10.strike(0); ftr2cl=ftr10.cls(null); break;
case 5: Sensay ftr11= new Sensay(); ftr2hlth=ftr11.stamina(0); ftr2strk=ftr11.strike(0); ftr2cl=ftr11.cls(null); break;
default: Boxer ftr12= new Boxer(); b=0; ftr2hlth=ftr12.stamina(0); ftr2strk=ftr12.strike(0); ftr2cl=ftr12.cls(null); break;
}

resp.getWriter().println("<br>"+ftr1cl+":"+"<br>");
resp.getWriter().println("Удар:"+ftr1strk+" урона"+"<br>");
resp.getWriter().println("Здоровье:"+ftr1hlth+" очков"+"<br>");
resp.getWriter().println("<br>");
resp.getWriter().println(ftr2cl+":"+"<br>");
resp.getWriter().println("Удар:"+ftr2strk+" урона"+"<br>");
resp.getWriter().println("Здоровье:"+ftr2hlth+" очков"+"<br>");
resp.getWriter().println("<br>");

int i=0;
double ftr1itg=100;
double ftr2itg=100;

do {i++;
resp.getWriter().println("Раунд "+i+":"+"<br>");
ftr2hlth=(int) (ftr2hlth-ftr1strk*Math.random());
ftr1hlth=(int) (ftr1hlth-ftr2strk*Math.random());
if (ftr1hlth<=0) {ftr1hlth=0; ftr1itg=101;}
if (ftr2hlth<=0) {ftr2hlth=0; ftr2itg=101;}
resp.getWriter().println(ftr1cl+": "+ftr1hlth+" очков здоровья"+"<br>");
resp.getWriter().println(ftr2cl+": "+ftr2hlth+" очков здоровья"+"<br>");	
resp.getWriter().println("<br>");
} while((ftr1hlth>0)&(ftr2hlth>0));


if (ftr1itg!=ftr2itg){
	
	if (ftr1itg<ftr2itg){
		resp.getWriter().println("<br>"+ftr1cl+" - победил");
	}
	else {
		resp.getWriter().println("<br>"+ftr2cl+" - победил");
	}
}
else {
	resp.getWriter().println("<br>"+"Ничья");
}




} 
}