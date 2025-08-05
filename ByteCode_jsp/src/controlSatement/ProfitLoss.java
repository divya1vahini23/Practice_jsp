package controlSatement;

import java.util.Scanner;
//16.Write a program to calculate profit or loss?
public class ProfitLoss {
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the product cost price");
      double cost=s.nextDouble();
      System.out.println("enter the selling price");
      double selling=s.nextDouble();
      if (cost>selling)
    	  System.out.println("loss");
      else 
    	  System.out.println("profit ");
      
	}

}
