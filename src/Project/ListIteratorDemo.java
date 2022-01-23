package Project;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

	public static void main(String[] args) {
		Vector<String>v=new Vector<>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println(v);
		
	    ListIterator<String> listIterator = v.listIterator();
	    while(listIterator.hasNext()) {
	    	     String next = listIterator.next();
	    	     System.out.println(next);
	    }
	    while(listIterator.hasPrevious()) {
   	     String next = listIterator.previous();
   	     System.out.println(next);
   	    
   }
		v.remove(3);
		v.set(2, "D");
		System.out.println(v);
		
		
		
	}

}
