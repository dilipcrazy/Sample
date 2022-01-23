package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(25);
	l.add('c');
	l.add("dilip");
	l.add(35);
	
	
	System.out.println(l);
	Iterator iterator = l.iterator();
    while(iterator.hasNext()) {
    	Object next = iterator.next();
    	System.out.println(next);
    	if(next.equals("dilip"))
        	iterator.remove();
    }
    
    System.out.println(l);
}
}
