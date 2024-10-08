import java.util.ArrayList;

class Employee{
	
	private int id;
	
	private String name;
	
	private String city;
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
	
}

public class Genric_01 {

	public static void main(String[] args) {
		
		// type-saftey
		
		int arr[] = new int[4];
		
		arr[0] = 14;
		arr[1] = 24;
		arr[2] = 34;
		arr[3] = 44;
		
		
		// type-saftey
		
		
		String[] str =  new String[3];	
		
		str[0] = "yash";
		str[1] = "java";
		str[2] = "devops";
		
		// No type-saftey
		
		ArrayList al = new  ArrayList();
		
		al.add("yash");
		al.add("java");
		al.add("Devops");
		al.add(44);
		
		String s1 = (String) al.get(0);
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		String s2 = (String) al.get(1);
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		String s3 = (String) al.get(2);
		s3 = s3.toLowerCase();
		System.out.println(s3);
		
//		String s4 = (String) al.get(3);
//		s4 = s4.toLowerCase();
//		System.out.println(s4);
		
		
		// type-saftey
		
		ArrayList<String> list = new ArrayList<>();	// generics
		
		list.add("java");
		list.add("springBoot");
		list.add("microservices");
		//list.add(10);	// compile error
		
		for (String st : list) {
			
			System.out.println(st);
		}
		
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1,"Ram", "Mumbai"));
		emp.add(new Employee(2,"Mohan", "Pune"));
		emp.add(new Employee(3,"Kaushal", "Chennai"));
		
		for(Employee e : emp) {
			
			System.out.println(e);
		}
		
//		ArrayList<int> e = new ArrayList<>();	// primitive is not allowed
		
//		ArrayList<Object> e = new ArrayList<Integer>();	// not allowed
		
		ArrayList<Integer> e = new ArrayList<>();
		
	}

}
