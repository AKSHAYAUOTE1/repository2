package collection;



import java.util.ArrayList;

public class arraylist {
	private static Object g;

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("abc");
		a.add(10);
		a.add('c');
		
		System.out.println(a);
		a.add("abc");
		System.out.println(a);
		a.add(null);
		a.add(null);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		a.set(2, 'g');
		System.out.println(a);
		a.add(1, 20);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		System.out.println(a.indexOf(20));
		ArrayList cnd=new ArrayList();
		cnd.add("yz");
		cnd.add(565);
		a.addAll(1, cnd);
		System.out.println(a);
		ArrayList snd=new ArrayList();
		snd.add("velocity");
		a.addAll(snd);
		System.out.println(a);
		//sy

	}

}

























