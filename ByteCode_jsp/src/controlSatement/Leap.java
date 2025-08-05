package controlSatement;

public class Leap {
    static int year=2003;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if ((year%4==0 && year%100 !=0) || (year%400==0))
			System.out.println("it is a leap year");
		else 
			System.out.println("not a leap year");

	}

}
