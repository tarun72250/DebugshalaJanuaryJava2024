package setDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class A_07_LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		Set<String> set=new LinkedHashSet<>();
		set.add("java");
		set.add("int");
		set.add("double");
		set.add("class");
		set.add("interface");
		set.add("implements");
		set.add("default");
		set.add("Double");
		
		for(String s:set)
			System.out.println(s);
		
		
	}
}
