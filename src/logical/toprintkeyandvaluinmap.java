package logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class toprintkeyandvaluinmap {
public static void main(String[] args) {
	HashMap<String, Integer> str= new HashMap<String, Integer>();
	str.put("aksh", 123);
	str.put("ram", 143);
	str.put("krishna", 143);
	System.out.println(str.containsKey("aksh"));
	
	Set<Entry<String, Integer>> entr = str.entrySet();
for(Entry<String, Integer> ent:entr) {
	System.out.println(ent.getValue());
	System.out.println(ent.getKey()+":"+ent.getValue());
	
}
}}
