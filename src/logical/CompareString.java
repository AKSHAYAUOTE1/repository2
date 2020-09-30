package logical;

import java.util.HashMap;
import java.util.Set;

public class CompareString {
	public static void main(String[] args) {
		String[]ar = {"java","jdbc","c","python","c"};
		HashMap<String, Integer> str = new HashMap<String,Integer>();
		for (String str2 : ar) {
			if(str.containsKey(str2)) {
				str.put(str2, str.get(str2)+1);
				
			}
			else {
				str.put(str2, 1);
			}
			Set<String> str3 = str.keySet();
			for (String str4 : str3) {
				if(str.get(str4)>1) {
				System.out.println(str4);
				}
				
			}
			
		}
	}

}
