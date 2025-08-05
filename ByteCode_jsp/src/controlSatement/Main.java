package controlSatement;
import java.util.Scanner;
 class Main{
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the employeed salary");
      double salary=sc.nextDouble();
      double bonus =salary+5000;
      System.out.println("enter the employee service");
      int service=sc.nextInt();
      
      if (service>5)
    	  System.out.println("credit the bonus"+(salary+bonus));
      else 
    	  System.out.println("not eligible for Bounus" );
	}
}
