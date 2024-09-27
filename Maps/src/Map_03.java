import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport{
	
	private String name;
	private String city;
	private String country;
	/**
	 * @param name
	 * @param city
	 * @param country
	 */
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
	
}

public class Map_03 {

	public static void main(String[] args) {
		
		Passport p1 = new Passport("Mohan", "Delhi", "India");
		Passport p2 = new Passport("Kamal", "Chennai", "India");
		Passport p3 = new Passport("Ayush", "Mumbai", "India");
		
		Integer id1 = Integer.valueOf(101);
		Integer id2 = Integer.valueOf(201);
		Integer id3 = Integer.valueOf(301);
		
		HashMap<Integer, Passport> hm = new HashMap();
		
		hm.put(id1, p1);
		hm.put(id2, p2);
		hm.put(id3, p3);
		
		//System.out.println(hm);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kindly enter your passport number");
		Integer usePn = sc.nextInt();
		
		Set entry = hm.entrySet();
		Boolean flag = false;
		Iterator itr = entry.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry pair = (Entry) itr.next();
			Integer key = (Integer) pair.getKey();
			
			if(usePn.equals(key)) {
				
				System.out.println("find passport details below!");
				System.out.println(pair.getValue());
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println("your passport id is invalid!");
		}
		
	}

}
