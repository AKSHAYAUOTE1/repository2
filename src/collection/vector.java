package collection;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		
	
	Vector v=new Vector();
	System.out.println(v.capacity());
	for(int i=0;i<=10;i++) {
	v.addElement(i);
	}
	System.out.println(v.capacity());
	v.addElement("a");
	System.out.println(v.capacity());
	for(int j=0;j<=10;j++) {
		v.addElement(j);
	}
System.out.println(v.capacity());
v.add(2, 'D');
v.addElement("akshay");
v.add("sonali");
System.out.println(v);
v.remove("akshay");
v.remove("sonali");
v.remove(2);

System.out.println(v);
System.out.println(v.get(11));
System.out.println(v.firstElement());
System.out.println(v.lastElement());
System.out.println(v.elementAt(11));

System.out.println(v.size());
System.out.println(v.capacity());



















}}
