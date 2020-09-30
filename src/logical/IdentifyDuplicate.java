package logical;

import java.util.HashMap;
import java.util.Set;

public class IdentifyDuplicate {
	public static void main(String[] args) {
		String ar="abcjsdfy4huhjk";
		char[] str = ar.toCharArray();
		HashMap<Character, Integer> smap = new HashMap<Character,Integer>();
		for (char str1 : str) {
			if(smap.containsKey(str1)) {
				smap.put(str1, smap.get(str1)+1);
				
				
			}
			else
		{
				smap.put(str1, 1);
				
			}
			Set<Character> keys = smap.keySet();
			for (char keys1: keys) {
				if(smap.get(keys1)>1) {
					System.out.println(keys1);
					
				}
				
			}
			
		}
		
			
		
		
	}

}
