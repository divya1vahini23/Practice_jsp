package controlSatement;

import java.util.Scanner;

public class Case {
//10.Write a program to check whether 
	//a character is uppercase or lowercase alphabet?

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		char c=s.next().charAt(0);
		if(c>='a'&&c<='z')
			System.out.println("its is lower case");
		else if (c>='A'&&c<='Z')
			System.out.println("its is Upper Case ");
		else 
			System.out.println("not defined as a case or alphabet");
     
	}

}
