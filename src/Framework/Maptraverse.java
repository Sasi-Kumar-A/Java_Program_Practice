package Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Maptraverse {
//By using the Map we can't traverse the data if we need to traverse first we need to convert it to Set then only we can traverse the data.

	public static void main(String[] args) {
		HashMap hm = new HashMap();
				
		hm.put(1, "hm");
		hm.put(null, 3325);
		hm.put('A', 2210.2);
		hm.put(true, 'L');
		hm.put(221.22, false);
		
		Set keys = hm.keySet();
		
		for(Object k : keys) {
			System.out.println(k+"-"+hm.get(k));
		}
		System.out.println("----------------------------");
		
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			Object k = it.next();
			System.out.println(k+"-"+hm.get(k));
		}
	}
}
