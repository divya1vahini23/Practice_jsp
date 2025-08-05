package controlSatement;

import java.util.Scanner;

public class EquTriangle {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter the first side of a triangle");
    int side1=s.nextInt();
    System.out.println("enter the second side of a triangle ");
    int side2=s.nextInt();
    System.out.println("enter the third side of a triangle");
    int side3=s.nextInt();
    if (side1==side2&&side2==side3)
    	System.out.println("The triangle is equalent");
    else if (side1==side2||side2==side3)
    	System.out.println("The triangle is isolate");
    else 
    	System.out.println("The given triangle is scalar");
	}

}
