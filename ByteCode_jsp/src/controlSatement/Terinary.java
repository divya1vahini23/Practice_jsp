package controlSatement;

import java.util.Scanner;

public class Terinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		String result=(marks>90&&marks<85)?"Distinct":(marks>75&&marks<85)? "firstclass":(marks>=55 && marks<=65)?"secondCls":(marks<55)?"failures":"entervalidmarks";          
        System.out.println(result);
	}

}
