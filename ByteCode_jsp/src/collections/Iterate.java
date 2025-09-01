package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("Apple");
    al.add("mango");
    al.add("grapes");
    al.add("pine");
    Iterator<String> i = al.iterator();
    while(i.hasNext()) {
        String s = i.next();
        if (s.equals("mango")) {
            i.remove();
            System.out.println("remove");
        }
    }
    System.out.println(al);
	}
	

}