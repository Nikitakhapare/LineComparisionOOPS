package com.oops.classmethod;

import java.util.Scanner;

import java.lang.Integer;

class Line {

	static double x1,x2,y1,y2,x3,y3,x4,y4;
	public static int distance1,distance2;
	Scanner sc =new Scanner(System.in);
	public void method1() {


		//first line
		System.out.println("enter x1 & y1 values of first point");
		x1=sc.nextDouble();
		y1=sc.nextDouble();

		System.out.println("enter x2 & y2 values of second point");
		x2=sc.nextDouble();
		y2=sc.nextDouble();

		distance1=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance of first line = "+distance1);
	}


	public void method2() {
		//second line 
		System.out.println("enter x3 & y3 values of third point");
		x3=sc.nextDouble();
		y3=sc.nextDouble();

		System.out.println("enter x4 & y4 values of fourth point");
		x4=sc.nextDouble();
		y4=sc.nextDouble();

		distance2=(int)Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Distance of second line = "+distance2);
	}

	public void method3() {
		int a= Integer.compare(distance1,distance2);
		if(a==0)
			System.out.println("both lines are equal");
		else if (a>0)
			System.out.println("Line1 is Greater");
		else
			System.out.println("Line2 is Greater");
	}

}		

public class LineComparision{
	public static void main(String[] args){
		Line ob1=new Line();
		ob1.method1();
		ob1.method2();
		ob1.method3();

	}

}
