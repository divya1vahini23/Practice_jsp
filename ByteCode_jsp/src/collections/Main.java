package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("apple");
		al.add("mango");
		al.add("grapes");
		ListIterator li=al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		System.out.println("Backward direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		

	}

}
