package controlSatement;

import java.util.Scanner;

//Write a program to check whether a number is divisible by 5 and 11 or not?
public class Divisibility {
	//static int a=20;
   public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
	   if(a%5==0 &a%11==0)
		   System.out.println("the number is divisible by 5 and 11");
	   else
		   System.out.println("the number is not divisible by 5 and 11");
	   s.close();
   }
   
}

