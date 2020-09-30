package collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector1 {
	
	public static void main(String[] args) {
		Vector m = new Vector(20);
		m.add(5);
		m.add("ram");
		System.out.println(m);
		m.add("electro");
		m.add(null);
		m.add("jani");
		m.add(2, "ju");
		m.set(5, 'h');
		
		
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.capacity());
		
		//*****print all elements in vector******
//		for (int i = 0; i <=m.size()-1; i++) {
//			System.out.println(m.get(i));
//			
//		}
		
		
		Enumeration k = m.elements();
		while(k.hasMoreElements()) {
			System.out.println(k.nextElement());
		}
		
		
		
	}

}
