  package controlSatement;

import java.util.Scanner;

public class ClassVowels {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		char c=s.next().charAt(0);
		if(((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))||((c=='A')||(c=='E')||(c=='I')||(c=='0')||(c=='U'))) 
			System.out.println("vowels");
		else
			System.out.println("constants");

	}
	
}
