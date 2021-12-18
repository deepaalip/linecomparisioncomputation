package com.bridgelabz;

import java.util.Scanner;

public class linecomparision {
	public static void main(String[] args){
	      System.out.println("Welcome To Line Comparison Computation Program.\n");

	      Scanner input = new Scanner(System.in);
	     
	      int x1, x2, y1, y2;
	      int a1,a2,b1,b2;
	      System.out.println("ENTER LINE-1 VALUES AS CARTESIAN COORDINATES[(x1,x2) & (y1,y2)] :- ");
	      System.out.print("ENTER X1 VALUE :- ");
	      x1 = input.nextInt();
	      System.out.print("ENTER X2 VALUE :- ");
	      x2 = input.nextInt();
	      System.out.print("ENTER Y1 VALUE :- ");
	      y1 = input.nextInt();
	      System.out.print("ENTER Y2 VALUE :- ");
	      y2 = input.nextInt();
	      
	      System.out.println("ENTER LINE-2 VALUES AS CARTESIAN COORDINATES[(a1,a2) & (b1,b2)] :- ");
	      System.out.print("ENTER a1 VALUE :- ");
	      a1 = input.nextInt();
	      System.out.print("ENTER a2 VALUE :- ");
	      a2 = input.nextInt();
	      System.out.print("ENTER b1 VALUE :- ");
	      b1 = input.nextInt();
	      System.out.print("ENTER b2 VALUE :- ");
	      b2 = input.nextInt();
	      double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	      double length2=Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
	      System.out.println("length of line 1 is: " +length);
	      System.out.println("length of line 2 is :" +length2);
	      
	      String L1 = Double.toString(length);
			String L2 = Double.toString(length2);

			if(L1.equals(L2)){
				System.out.println("LINE 1 IS EQUAL TO LINE 2.");
			}
			else{
				System.out.println("LINE 1 IS NOT EQUAL TO LINE 2.");
			}

	}
}
