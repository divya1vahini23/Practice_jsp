package collections;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
      ArrayList al=new ArrayList();
      al.add(10);
      al.add(20);
      al.add(30);
      System.out.println(al.get(2));
      for(int i=0;i<al.size();i++) {
    	  System.out.println("values"+al.get(1));
      }
      for(Object val:al) {
    	  System.out.println("value"+val);
      }
	}

}
