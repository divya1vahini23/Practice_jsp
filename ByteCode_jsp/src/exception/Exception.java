package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exception {

	public void data_saving()throws FileNotFoundException{
		FileOutputStream fount=null;
		fount=new FileOutputStream("C:\\Users\\G.Divyavahini\\Downloads");
//		C:\Users\G.Divyavahini\Downloads
	}
	public static void main(String[] args) {
		Exception obj=new Exception();
		try {
			obj.data_saving();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
