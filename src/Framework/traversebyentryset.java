package Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class traversebyentryset {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
				
				hm.put(1, "hm");
				hm.put(null, 3325);
				hm.put('A', 2210.2);
				hm.put(true, 'L');
				hm.put(221.22, false);
				
				Set map = hm.entrySet();
				
				for(Object k : map) {
					System.out.println(k);
				}
				System.out.println("----------------");
				Iterator it = map.iterator();
				while(it.hasNext()) {
					Object k = it.next();
					System.out.println(k);
				}
	}
}
