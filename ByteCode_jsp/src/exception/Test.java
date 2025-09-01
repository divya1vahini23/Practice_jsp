package exception;	
import java.io.IOException;
public class Test {
     public void display()throws IOException {
//    	 int a=1/0;
    	 int value=-1;
    	 if (value<0)
    		 throw new IOException("value greater then 0");   	 
     }
	public static void main(String[] args)  { 
		Test obj=new Test();
		try{
			obj.display();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
