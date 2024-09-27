import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

class Alpha
{
	
	int id;
	String CouseName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCouseName() {
		return CouseName;
	}
	public void setCouseName(String couseName) {
		CouseName = couseName;
	}
	@Override
	public String toString() {
		return "Alpha [id=" + id + ", CouseName=" + CouseName + "]";
	}
	/**
	 * @param id
	 * @param couseName
	 */
	public Alpha(int id, String couseName) {
		super();
		this.id = id;
		CouseName = couseName;
	}
	/**
	 * 
	 */
	public Alpha() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
public class map_01 {

	public static void main(String[] args) {
		
		HashMap hm1 = new HashMap();
		
		hm1.put(1, "Java");
		hm1.put(2, "SpringBoot");
		hm1.put(3, "DevOps");
		hm1.put(4, "Microservices");
		
		System.out.println(hm1);
		
		Alpha a = new Alpha(1, "java");
		
//		HashMap hm2 = new HashMap();
//		
//		hm2.put(a, "Spring");	// key-value
//		
//		hm2.put(4, "MicroServices");
////		hm2.put(4, "MicroServices");	// key must be unique
//		
//		hm2.put(5, "MicroServices");
//		
//		hm2.put(null, "MicroServices");	// key can be null
//		hm2.put(6,null);	// value can also be null
//		
//		System.out.println(hm2);
		
		
//		LinkedHashMap hm2 = new LinkedHashMap();	// LinkedHaspMap is Child class of HashMap
//		
//		hm2.put(a, "Spring");	// key-value
//		
//		hm2.put(4, "MicroServices");
////		hm2.put(4, "MicroServices");	// key must be unique
//		
//		hm2.put(5, "MicroServices");
//		
//		hm2.put(null, "MicroServices");	// key can be null
//		hm2.put(6,null);	// value can also be null
//		
//		System.out.println(hm2);
		
//		HashMap<Integer, String> hm2 = new HashMap<>();
//		
//		hm2.put(1, "Java");	// Entry
//		hm2.put(2, "SpringBoot");
////		hm2.put("java", "Junit");	// ce
//		
//		
//		System.out.println(hm2);
		
		Hashtable ht = new Hashtable();	// Hashtable
		
		ht.put(1, "Alien");
		ht.put(2, "Alien");
//		ht.put(null, "Spring");	// key cannot be null
//		ht.put("abc", null);	// value cannot be null
		
		System.out.println(ht);
		
		
		TreeMap tm = new TreeMap();	// sort on the basis of the key
		
		tm.put(2, "Boot");
		tm.put(1, "Junit");
//		tm.put(null, "java"); // key cannot be null\
		tm.put(3, null);	// value can be null
		
		System.out.println(tm);
	}

}
