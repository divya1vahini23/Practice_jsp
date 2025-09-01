package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator1 {
	public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add("sita");
    al.add("ram");
    al.add("ravan");
    al.add("hanuman");
    al.add("laxman");
    ListIterator li=al.listIterator(2);
    while(li.hasNext()) {
    	System.out.println(li.next());
    }
  /*  System.out.println();
    System.out.println("backward");
    while(li.hasPrevious()) {
    	System.out.println(li.previous());*/
    }
    
	}


