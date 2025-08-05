package controlSatement;

import java.util.Scanner;

public class Triangle {
//Write a program to input angles of a triangle and check whether
	// triangle is valid or not?
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first angle");
	int angle1 =s.nextInt();
	System.out.println("enter the second angle");
	int angle2=s.nextInt();
	System.out.println("enter the third angle");
	int angle3=s.nextInt();
	int sum=angle1+angle2+angle3;
	if (sum==180 && angle1 > 0 || angle2 >0 ||angle3 >0 )
	System.out.println("the given triangle makes valid triangle");
	else 
		System.out.println("the given triangle is invalid");
	}

}
