package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylis {
	public static void main(String[] args) {
		 ArrayList h = new ArrayList();
		 h.add("akshay");
		 h.add("5");
		 h.add("200");
		 h.add("A");
		 System.out.println(h);
		 h.add(2, 300);
		 System.out.println(h);
	 h.set(2, "aki");
	 System.out.println(h);
	 System.out.println(h.size());
	 System.out.println(h.get(3));
	 h.add("null");
	 System.out.println(h.indexOf("aki"));
	 System.out.println(h.isEmpty());
	 
	 
	 //*******print all element in array list******
	 for (int i = 0; i <=h.size()-1; i++) {
		 System.out.println(h.get(i));
		
	}
	 
	 
	 
	 
	 
	 //******print all element using iterator cursor******
//	 Iterator k = h.iterator();
//	while( k.hasNext()) {
//		System.out.println(k.next());
//	}
	}

}
