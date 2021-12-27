package com.bridgelabz;

import java.util.Scanner;

public class linecomparision{

	public static void main(String[] args){
	      System.out.println("Welcome To Line Comparison Computation Program.\n");

	      Scanner input = new Scanner(System.in);
	     
	      int x1, x2, y1, y2;
	      System.out.println("ENTER LINE-1 VALUES AS CARTESIAN COORDINATES[(x1,x2) & (y1,y2)] :- ");
	      System.out.print("ENTER X1 VALUE :- ");
	      x1 = input.nextInt();
	      System.out.print("ENTER X2 VALUE :- ");
	      x2 = input.nextInt();
	      System.out.print("ENTER Y1 VALUE :- ");
	      y1 = input.nextInt();
	      System.out.print("ENTER Y2 VALUE :- ");
	      y2 = input.nextInt();
	      double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	      System.out.println(length);

	}
}	
	
	
