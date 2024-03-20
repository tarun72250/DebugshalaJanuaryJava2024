package mapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class A_12_MapDemo {

	public static void main(String[] args) {
		//Map<Integer,String> map = new HashMap<>();
		Map<Integer,String> map = new TreeMap<>();
		map.put(12, "Amit");
		map.put(21, "Jivan");
		map.put(23, "Sheela");
		map.put(67, "Maya");
		map.put(54, "Meena");
		map.put(45, "Dipak");
		map.put(21, "Priya");
		map.put(11, "Amit");
		
		System.out.println(map);
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		//for-each
		for(Map.Entry<Integer,String> me  : set )
			System.out.println(me.getKey()+" : "+me.getValue());
		
		System.out.println("******************");
		Iterator<Entry<Integer,String>> i = set.iterator();
		while(i.hasNext())
		{
			Entry<Integer,String> e = i.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}

	}

}
