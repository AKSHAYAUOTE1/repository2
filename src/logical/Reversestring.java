package logical;

import loops.forloop;

public class Reversestring {
public static void main(String[] args) {
	String org="aksh45sj";
	String rev="";
	for (int i = org.length()-1; i>=0; i--) {
		rev=rev+org.charAt(i);
		
	}
	System.out.println(rev);
	System.out.println(org.length());
	System.out.println(org.charAt(7));
}
}
