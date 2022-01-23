package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {
		// HashMap
		// HashMap allow dissimilar data with key and value
		// HashMap not allow duplicate key
		// HashMap allow duplicate value
		// HashMap execute randomly
		
		Map<String,Integer>  m=new HashMap<>();
	
        m.put("dilip", 5);
        m.put("siva", 5);
        m.put("mohana", 8);
        System.out.println(m);
        Integer integer = m.get("mohana");
        System.out.println(integer);
         m.remove("dilip");
         m.replace("siva", 25);
         boolean containsKey = m.containsKey("siva");
         System.out.println(containsKey);
        //System.out.println(integer2);
        // Only key value
        System.out.println(m.keySet());
        // Only Value
        System.out.println(m.values());
        m.put("akash", 7);
        System.out.println(m);
       
        // iterate the map first we get entryset method
        Set<Entry<String, Integer>> entrySet = m.entrySet();
       
        for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
        // LinkedHashMap
        // Execute insertion order
        // Not allow duplicate keys
        // allow duplicate value
        // allow null in key and value
        Map<String,Integer> l=new LinkedHashMap<>();
        l.put("naveen", 1);
        l.put("gokul", 2);
        l.put("vishnu", 3);
        l.put("abi", 1);
        l.put(null, null);
        System.out.println(l);
       
        // TreeMap
        // TreeMap not allow null value
        // TreeMap not allow duplicate key
        // allow duplicate value
        // Execute ascending order
        Map<String,Integer> t= new TreeMap<>();
        t.put("naveen", 1);
        t.put("gokul", 2);
        t.put("vishnu", 3);
        t.put("abi", 1);
      //  t.put(null, null);
        t.put("suma", 1);
        System.out.println(t);
       
	}

}
