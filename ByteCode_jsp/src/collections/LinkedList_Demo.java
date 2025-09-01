package collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList_Demo {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(0.2f);
	l.add('A');
//	Iterator i=l.iterator();
	Iterator i=l.descendingIterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	
	
	
	}

}
