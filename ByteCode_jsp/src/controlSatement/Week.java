package controlSatement;
import java.util.Scanner;
public class Week {
	//11.Write a program to input week number and print week day?

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a week number(1-7)");
        int week=s.nextInt();
        switch(week) {
        case 1:
        	System.out.println("sunday");
        	break;
        case 2:
        	System.out.println("monday");
        	break;
        case 3:
        	System.out.println("tuesday");
        	break;
        case 4:
            System.out.println("wednesday");
            break;
        case 5:
        	System.out.println("Thursday");
        	break;
        case 6:
        	System.out.println("friday");
        	break;
        case 7:
        	System.out.println("saturday");
            break;
        default:
        	System.out.println("invalid");
        }
        
        
	}

}
