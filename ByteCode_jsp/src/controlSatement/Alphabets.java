package controlSatement;

import java.util.Scanner;

public class Alphabets {
 public static void main(String args[]) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter char");
	  char ch=s.next().charAt(0);
	  if((ch>='A'&& ch>='Z')||(ch>='a'&&ch<='z'))
		  System.out.println(ch+"the given is charAt");
	  else
		  System.out.println(ch+"not a charAt");
	  s.close();

 }
}
