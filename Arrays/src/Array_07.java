
class Maine {
	
	private String name;
	private int age;
	private String City;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Maine(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		City = city;
	}
	
	public Maine() {
		
		super();
	}

	@Override
	public String toString() {
		return "Maine [name=" + name + ", age=" + age + ", City=" + City + "]";
	}
	
	

}

public class Array_07 {

	public static void main(String[] args) {
		
		Maine m = new Maine("Yash",12,"Haldwani");
		
		System.out.println(m);
		
//		System.out.println(m.getName());
//		System.out.println(m.getAge());
//		System.out.println(m.getCity());
//		
		 
	}

}
