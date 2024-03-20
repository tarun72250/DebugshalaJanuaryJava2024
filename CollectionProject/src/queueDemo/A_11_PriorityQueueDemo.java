package queueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class A_11_PriorityQueueDemo {

	public static void main(String[] args)
	{
		//acc  to their ascii value arranged
		Queue<String> queue=new PriorityQueue<>();
		queue.add("int");
		queue.add("double");
		queue.add("float");
		queue.add("char");
		queue.add("long float");
		queue.add("interface");
		queue.add("default");
		queue.add("DOUBLE");
		queue.add("static");
		queue.add("char");
		
		System.out.println("----Acc to their ascie value arranged---- ");
		for(String s:queue)
			System.out.println(s);
		
		System.out.println("-----removal sequence------");
		while((!queue.isEmpty()));
		{
		//	System.out.println(queue.remove()+ " : "+queue.size());
			System.out.println(queue.poll()+ " : "+queue.size());
			
		}
	}
}
