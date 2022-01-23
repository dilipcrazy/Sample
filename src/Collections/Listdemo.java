package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
		// ArrayList
		//Allow duplicate value
		//Allow null value
		List l=new ArrayList();
		l.add("dilip");
		l.add(1);
		l.add('c');
		l.add(true);
		l.add("abi");
		l.add("dilip");
		l.add(null);
		l.add(null);
		l.add("dilip");
		System.out.println(l);
		// get the index value
		Object object = l.get(5);
		System.out.println(object);
		// list contains 
		boolean contains = l.contains('c');
		System.out.println(contains);
		// Replace the value using index
	    l.set(6, "Siva");
	    System.out.println(l);
	    // Add the new value
	    l.add("Mohana");
	    System.out.println(l);
	    // remove the value using index
	    l.remove(7);
	    System.out.println(l);
	    // first index value
	    int indexno = l.indexOf("dilip");
	    System.out.println(indexno);
	    // Last index of
	    int lastIndexOf = l.lastIndexOf("dilip");
	    System.out.println(lastIndexOf);
	    // Size of the list
	    int size = l.size();
	    System.out.println(size);
	    // Iteration using forLoop
	    for (int i = 0; i <l.size(); i++) {
			System.out.println(l.get(i));
		}
	    // Clear all the value in the list
	    //l.clear();
	   // System.out.println(l);
	    
	    // Linked Array List
	    // Allow duplicate value and null
	    List li=new LinkedList();
	    boolean addAll = li.addAll(l);
	    System.out.println(addAll);
	    System.out.println(li);
	    li.add("Rangasamy");
	    li.add("Rangasamy");
	    li.add(null);
	    li.add(null);
	    li.add("Kajini");
	    System.out.println(li);
	    // Remove common Value
	    li.removeAll(l);
	    System.out.println(li);
	    // Remove Uncommon value
	   // li.retainAll(l);
	  //  System.out.println(li);
	    List<Integer> m=new ArrayList<>();
	    

	}

}
