package array;
//1.Write a java program to find the sum of all elements.
public class Sum {
   
	public static void main(String[] args) {
		int[] num= {10,20,30,40};
		int sum=0;
		for (int i=0;i<num.length;i++) {
			sum += num[i];
			System.out.println("the sum of elements "+sum);
			
		}
		// TODO Auto-generated method stub

	}

}
