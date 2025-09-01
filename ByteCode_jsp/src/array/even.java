package array;
//2.Write a program to print even elements in a given array
public class even {
	public static void main(String[] args) {
        int[] arr= {12,2,3,5,6,7};
        for(int i=0;i<arr.length;i++)
        if(arr[i]%2==0) {
        	System.out.println(+arr[i]);
        }
        
	}

}
