package controlSatement;
import java.util.Scanner;
public class Type {
	//Write a program to input any character and 
	//check whether it is alphabet, digit or special character?
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the value");
     char c=s.next().charAt(0);
     if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
    		 System.out.println(c+"  the give char is alphabet");
     //int a=s.nextInt();                        
     else if(c>='0' && c<='9')
    	 System.out.println(c+"  the given char is digit");
     else
    	 /*
    	  *                 
    	  *                     
    	  *                     
    	  *                     
    	  *                     
    	  *                     */
    	 System.out.println(c+"  the given char is special character");
	}
}
