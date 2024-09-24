
class Employee {
	
	private int id;
	private String name;
	
	void setName(String n) {
		
		name = n;
	}
	
	void setId(int i) {
		
		id = i;
	}
	
	int getId() {
		
		return id;
	}
	
	String getName() {
		
		return name;
	}
}

public class Encap_02 {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setId(10);
		e.setName("Rahul");
		
		System.out.println(e.getId());
		System.out.println(e.getName());

	}

}
