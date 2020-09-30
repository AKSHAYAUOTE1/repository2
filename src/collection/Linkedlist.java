package collection;

import com.graphbuilder.struc.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.addToHead('D');
		l.addToTail("akshay");
		l.addToTail("sonali");
		l.addToHead("ram");
		l.addToHead("ram");
		System.out.println(l);
		System.out.println(l.getHead());
		System.out.println(l.getTail());
		l.removeHead();
		System.out.println(l);
		l.removeTail();
		System.out.println(l);
		
		//******to print  elements*****
		
	
		
		
		
	}

}
