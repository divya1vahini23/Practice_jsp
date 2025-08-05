package controlSatement;

import java.util.Scanner;

public class Stu_percentage {
//17.Calculate Student Percentage and Grade in Java?

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the student marks ");
      double marks=sc.nextDouble();
      double percentage=(marks/500)*100;
      System.out.println("The percentage of student marks is" +percentage);
      if (percentage >75&& percentage<65) 
    	  System.out.println("A grade student");
      else if(percentage >65 && percentage<55)
    	  System.out.println("B grade student");
      else if (percentage >55 && percentage<45)
    	 System.out.println("C grade student");
      else 
    	  System.out.println("D grade student");
      
      }

}
