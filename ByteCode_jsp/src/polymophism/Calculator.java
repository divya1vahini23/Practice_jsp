package polymophism;

public class Calculator {
	public void multiply(int a,int b){
		int result=a*b;
		System.out.println(result);
	}
	public void multiply(int a,int b,int c) {
		int result=a*b*c;
		System.out.println(result);
	}
	public void multiply(double d,int b) {
		double result=d*b;
		System.out.println(result);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
	    c.multiply(1, 2);
		c.multiply(1, 2, 3);
		c.multiply(7.0, 2);
		
		
	}

}
