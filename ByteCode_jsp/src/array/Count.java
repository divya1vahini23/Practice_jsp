package array;
//3.Count no of odd and even elements in an array.
public class Count {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,6,7,8,9,};
		int even_count=0,odd_count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				even_count++;
			else
				odd_count++;
		}
		 System.out.println("even count is "+even_count);
		 System.out.println("odd count is "+odd_count);

	

	}

}
