package Project;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Enumerationdemo {

	public static void main(String[] args) {
		Hashtable<String,Integer> l=new Hashtable<>();
		
	     
		 l.put("dilip", 1);
		 l.put("siva", 2);
		 l.put("mohana", 3);
		  
		 System.out.println(l);
		 Set<Entry<String,Integer>> entrySet = l.entrySet();
		 
		 for(Entry<String,Integer> entry:entrySet){
			System.out.println(entry); 
			 
		 }
		 
		 Enumeration<Integer> elements = l.elements();
		 while(elements.hasMoreElements())
		 {
			 Integer nextElement = elements.nextElement();
			 System.out.println(nextElement);
		 }
			
		 
		 Vector v=new Vector();
		 v.add(5);
		 v.add("dilip");
		 v.add('c');
		 System.out.println(v);
		 Enumeration ele = v.elements();
		 while(ele.hasMoreElements())
		 {
			 Object nextElement = ele.nextElement();
			 System.out.println(nextElement);
		 }
		
		 
	}

}
