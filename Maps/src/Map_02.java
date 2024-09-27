import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

interface Omega{
	
	interface Beta{
		
		static void disp() {
			
			System.out.println("Static method of inner interface");
		}
	}
}

public class Map_02 {

	public static void main(String[] args) {
			
		
		//Omega.Beta.disp();
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(1, "Java");	// Entry --> Map
		hm.put(2, "DSA");
		hm.put(3, "Spring");
		
		System.out.println(hm);
		
		String data = hm.get(3);
		
		System.out.println(data);
		
		System.out.println("**************************");
		
		Collection<String> values = hm.values();
		
		Iterator<String> itr = values.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**************************");
	
		Collection<Integer> keys = hm.keySet();
		Iterator<Integer> itr1 = keys.iterator();
		
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
		System.out.println("***************************");
		
		Set entry = hm.entrySet();
		Iterator itr3 = entry.iterator();
		
		while(itr3.hasNext()) {
			
			Map.Entry pair = (Entry) itr3.next();
			System.out.println("Key: " + pair.getKey() + " Value: "+ pair.getValue() );
		}
	}

}
