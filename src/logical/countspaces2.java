package logical;

import loops.forloop;

public class countspaces2 {
	public static void main(String[] args) {
		
	int cnt=0;
String str=" abx aksn sjka s ska ska akk";
String ar[]=str.split(" ");
 for(int i=0;i<=str.length()-1;i++) {
	 if (str.charAt(i)==' ') {
		 cnt++;
		
	}
 }
System.out.println(cnt);
}}
