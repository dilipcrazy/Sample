package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		// HashSet not allow duplicate value
		// HashSet allow null value
		// HashSet execution order randomly
		// Set not allow index value
		Set s=new HashSet();
		s.add("dilip");
		s.add(1);
		s.add(true);
		s.add('c');
		s.add("dilip");
		s.add(null);
		System.out.println(s);
		s.add("Siva");
		s.remove(null);
		System.out.println(s);
		int size = s.size();
		System.out.println(size);
		
		// For each Iteration only 
		for (Object object : s) {
			System.out.println(object);
		}
		// LinkedHashSet
		// value executes in insertion order
		// Not allow duplicate value
		// allow null value
		Set l=new LinkedHashSet();
		l.addAll(s);
		System.out.println(l);
		l.add("naveen");
		l.add("Aakash");
		l.add(null);
		System.out.println(l);
		// TreeSet 
		// TreeSet not allow duplicate and null
		// TreeSet not allow to compare the linkedhashset
		// data Execute ascending order
		// TreeSet allow only Generics
		Set<String> t=new TreeSet<>();
		t.add("Dilip");
		t.add("Siva");
		t.add("Akash");
		t.add("Billa");
		System.out.println(t);
	//	t.clear();
		t.remove("Billa");
		boolean contains = t.contains("Dilip");
		System.out.println(contains);
	    for (String string : t) {
			System.out.println(string);
		}
		
		System.out.println(t);
		

	}

}
