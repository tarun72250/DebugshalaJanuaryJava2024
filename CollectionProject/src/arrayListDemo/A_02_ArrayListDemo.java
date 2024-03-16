package arrayListDemo;

import java.util.*;
import java.util.function.Consumer;
public class A_02_ArrayListDemo {

	public static void main(String[] args) {
		/*List words = new ArrayList();
		words.add("hello");
		words.add(45);
		words.add(Calendar.getInstance().getTime());
		
		((String)words.get(2)).toUpperCase();
		*/
		
	
		List<String> words = new ArrayList<>();
		//words.add(Calendar.getInstance().getTime());
		words.add("Tarun");
		words.add("Mahesh");
		words.add("pratik");
		words.add("ajay");
		words.add("anup");
		words.add("threads");
		words.add("streams");
		words.add("instance");
		words.add("object");
		
		System.out.println(words); //toString
		words.add(3,"wrapper");
		System.out.println(words); //toString
		words.remove(2);
		System.out.println(words); //toString
		words.remove("object");
		System.out.println("object remove:"+words); //toString
		
		words.set(1, "wrapper classes");
		System.out.println("1 index wrapper set :"+words); //toString
		
		System.out.println(words.get(5));
		System.out.println(words.size());
		
		//iteration for each loop
		for( String  s:words )  //s represents one element
			System.out.print(s.toUpperCase()+" ");
		
		
		
		System.out.println();
		System.out.println("******ITERATOR interface or iterator method*******");
		//iterating using Iterator
		Iterator<String> i= words.iterator();
		while(i.hasNext())
			 System.out.print(i.next()+" ");
		System.out.println("*************");
		 
		
		
		//iterating - ListIterator 
		System.out.println("******List iterator print in reverse order*******");
		ListIterator<String> li = words.listIterator(words.size());
		while(li.hasPrevious())
			System.out.println(li.previous());
		System.out.println("*************");
		
		
		
		//each words legth
//				words.forEach
//				(new Consumer<String>() 
//				{
//					public void accept(String t)
//					{
//						System.out.println(t);				
//					}			
//				}
//				);
//				System.out.println("***************");
//				words.forEach(s -> System.out.println(s+":"+s.length()));
//				System.out.println("***************");
			
				
	words.forEach
	(new Consumer<String>()
	{

		public void accept(String t) 
		{
			System.out.println(t);
		}
		
	});
	System.out.println("-------------------");
	words.forEach(t-> System.out.println(t+":"+t.length()));
			System.out.println("-------------------------");
			
			
		//basic algorithms with their ascii value
		Collections.sort(words);
		words.forEach(s-> System.out.println(s));
		
		
		
		int n = Collections.binarySearch(words, "streams");
		System.out.println("Index : "+ n);
		
		
		System.out.println();
		System.out.println("***SHUFFLE***");
		Collections.shuffle(words);
		System.out.println(words);
		
	}

}
