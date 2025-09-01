package array;
import java.util.Scanner;
public class Reverse {
//4.Write  a program to reverse  the array.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int num=sc.nextInt();
		int[] arr=new int[num];
        System.out.println("Enter " + num + " elements:");
        for (int i=0;i<num;i++)
        	num=sc.nextInt();
        for(int i=num-1;i>=0;i--) {
        System.out.println(arr[i]);
     } 
	}
}
