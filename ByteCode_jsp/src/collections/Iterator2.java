package collections;
import java.util.ArrayList;
import java.util.ListIterator;
public class Iterator2 {
	public static void main(String[] args) {
	 ArrayList al=new ArrayList();
	 al.add("divi");
	 al.add("manu");
	 al.add("janu");
	 al.add("anu");
	 ListIterator li=al.listIterator();
     String s=(String)li.next();
     { 
    	 System.out.println(al);
    	 if(s.equals("divi")) {
    		 li.add("situ");
    	 }
    		
    		 System.out.println("after modification");
    		 System.out.println(al);
     }
	}

}
