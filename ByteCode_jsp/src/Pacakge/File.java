package Pacakge;
import java.io.IOException;
import java.io.FileOutputStream;

public class File {
	public static void main(String[] args) {
		String data="Bytecode";
		try(
		FileOutputStream fount=new FileOutputStream("C:\\Users\\G.Divyavahini\\Downloads\\bytecode.txt")) {
			byte[] b=data.getBytes();
			fount.write(b);
		
		    System.out.println("file created sucessfully");
		}
	}
      catch(IOException e) {
		e.printStackTrace();
	}

}
