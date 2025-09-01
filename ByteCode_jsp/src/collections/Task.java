package collections;
import java.util.ArrayList;
public class Task {
/*1.ArrayList – Create an ArrayList of integers.Perform:
•	Add numbers
•	Remove a number at a given index
•	Update an element
•	Search for an element
*/
	public static void main(String[] args) {
     ArrayList a=new ArrayList();
     a.add(10);
     a.add(20);
     a.add(30);
     a.add(40);
     a.add(50);
     System.out.println(a);
     a.remove(2);
     System.out.println(a);
     a.set(1,22);
     System.out.println(a);
     System.out.println(a.contains(5));
     System.out.println(a.indexOf(40));
     }

}
