package collections;
import java.util.Enumeration;
import java.util.Vector;
public class Vector_demo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.addElement(10);
		v.add(23.3);
		v.add('A');
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		

	}

}
